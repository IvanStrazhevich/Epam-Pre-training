package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.TransportRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.NoSuchNodeException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Sortable;

import java.util.ArrayList;

public class TreeRepository<T extends Comparable<T>> extends TransportRepository implements Sortable<T> {
    private Node root;
    private int count;

    public TreeRepository() {
    }

    private String goInOrderTraversal(StringBuffer stringBuffer, Node node) {

        if (node != null) {
            goInOrderTraversal(stringBuffer, node.left);
            stringBuffer.append(node.value.toString());
            goInOrderTraversal(stringBuffer, node.right);

        }
        return stringBuffer.toString();

    }

    public String showInOrder() {
        StringBuffer stringBuffer = new StringBuffer();
        return goInOrderTraversal(stringBuffer, root).toString();
    }

    private String goPostOrderTraversal(StringBuffer stringBuffer, Node node) {

        if (node != null) {
            goPostOrderTraversal(stringBuffer, node.left);
            goPostOrderTraversal(stringBuffer, node.right);
            stringBuffer.append(node.value.toString());
        }
        return stringBuffer.toString();

    }

    public String showPostOrder() {
        StringBuffer stringBuffer = new StringBuffer();
        return goPostOrderTraversal(stringBuffer, root).toString();
    }

    private String goPreOrderTraversal(StringBuffer stringBuffer, Node node) {

        if (node != null) {
            stringBuffer.append(node.value.toString());
            goPreOrderTraversal(stringBuffer, node.left);
            goPreOrderTraversal(stringBuffer, node.right);
        }
        return stringBuffer.toString();

    }

    public String showPreOrder() {
        StringBuffer stringBuffer = new StringBuffer();
        return goPreOrderTraversal(stringBuffer, root).toString();
    }

    //inOrderTraversal
    private Object[] showElements(Node node) {
        ArrayList<String> result = new ArrayList<>();
        if (node.left != null) {
            Object[] temp = showElements(node.left);
            for (int i = 0; i < temp.length; i++) {
                result.add("" + temp[i]);
            }
        }
        result.add(node.value.toString());
        if (node.right != null) {
            Object[] temp = showElements(node.right);
            for (int i = 0; i < temp.length; i++) {
                result.add("" + temp[i]);
            }
        }
        return result.toArray();
    }

    private boolean findNode(Node node, T element) {
        if (node.value.compareTo(element) == 0) {
            return true;
        } else if (node.value.compareTo(element) < 0) {
            if (node.right == null) {
                return false;
            } else {
                return findNode(node.right, element);
            }
        } else if (node.value.compareTo(element) > 0) {
            if (node.left == null) {
                return false;
            } else {
                return findNode(node.left, element);
            }
        } else {
            return false;
        }
    }

    private Node deleteFromRoot(Node node, T element) {
        if (node == null) {
            return null;
        } else if (node.left == null || node.right.left == null) {
            node.right.left = node.left;
            return node.right;
        } else if (node.left.value.compareTo(node.right.left.value) <= 0) {
            Node temp = node.right.left.left;
            node.right.left.left = deleteFromRoot(temp, element);
            return node.right;
        } else {
            Node temp = node.left.left;
            node.left.left = deleteFromRoot(temp, element);
            return node.right;
        }
    }

    private Node delete(Node node, T element) {
        if (node == null) {
            return null;
        } else if (element.compareTo((T) node.value) == 0) {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else if (node.right == null && node.left == null) {
                return node;
            } else {
                return deleteFromRoot(node, (T) node.left.value);
            }
        } else if (element.compareTo((T) node.value) > 0) {
            if (node.right == null) {
                return node;
            } else {
                node.right = delete(node.right, element);
                return node;
            }
        } else if (element.compareTo((T) node.value) < 0) {
            if (node.left == null) {
                return node;
            } else {
                node.left = delete(node.left, element);
                return node;
            }
        } else if (node.left == null && node.right == null) {
            return node;
        } else {
            return node.left;
        }
    }

    @Override
    public boolean add(Object element) {
        if (root == null) {
            root = new Node(root, (T) element);
            count++;
        } else {
            root.addNode(root, (T) element);
            count++;
        }
        return true;
    }

    @Override
    public boolean contains(Object element) {
        if (root.value.compareTo(element) == 0) {
            return true;
        } else {
            return findNode(root, (T) element);
        }
    }

    @Override
    public boolean removeElement(Object element) {
        if (contains(element)) {
            if (root.value.compareTo(element) == 0) {
                if (root.left != null) {
                    root = deleteFromRoot(root, (T) root.left.value);
                    count--;
                    return true;
                } else {
                    return false;
                }
            } else if (delete(root, (T) element) != null) {
                count--;
                return true;
            } else {
                return false;
            }
        } else {
            try {
                throw new NoSuchNodeException("No such node");
            } catch (NoSuchNodeException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    @Override
    public void clear() {
        root = null;
        count = 0;
    }

    @Override

    public int count() {
        return count;
    }

    @Override
    public Object[] showOrderedElementsArray() {
        if (root != null) {
            return showElements(root);
        } else {
            Object[] line = {"There is no elements"};
            return line;
        }
    }

    public static class Node<E extends Comparable<E>> {
        E value;
        private int nodesNumber;
        private Node<E> left;
        private Node<E> right;
        private Node<E> parent;

        public Node(Node node, E value) {
            this.parent = node;
            this.value = value;
        }

        private void addNode(Node node, E element) {
            if (element.compareTo(value) > 0) {
                if (right == null) {
                    right = new Node<>(node, element);
                } else {
                    right.addNode(right, element);
                }
            } else {
                if (left == null) {
                    left = new Node<>(node, element);
                } else {
                    left.addNode(left, element);
                }
            }
        }

    }
}


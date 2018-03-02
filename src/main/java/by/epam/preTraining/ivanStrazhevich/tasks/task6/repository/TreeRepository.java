package by.epam.preTraining.ivanStrazhevich.tasks.task6.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.TransportRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.ITree;

import java.util.ArrayList;

public class TreeRepository<T extends Comparable<T>> extends TransportRepository implements ITree<T> {
    private Node root;
    private int count;

    public TreeRepository() {
    }

    private Object[] showElements(Node element) {
        ArrayList<String> result = new ArrayList<>();
        if (element.left != null) {
            Object[] temp = showElements(element.left);
            for (int i = 0; i < temp.length; i++) {
                result.add(" " + temp[i]);
            }
        }
        result.add(element.value.toString());
        if (element.right != null) {
            Object[] temp = showElements(element.right);
            for (int i = 0; i < temp.length; i++) {
                result.add(" " + temp[i]);
            }
        }
        return result.toArray();
    }

    private boolean findNodes(Node parent, T element) {
        if (parent.value.compareTo(element) == 0) {
            return true;
        } else if (parent.value.compareTo(element) < 0) {
            if (parent.right == null) {
                return false;
            } else {
                return findNodes(parent.right, element);
            }
        } else if (parent.value.compareTo(element) > 0) {
            if (parent.left == null) {
                return false;
            } else {
                return findNodes(parent.left, element);
            }
        } else {
            return false;
        }
    }

    private Node delete(Node node, T element) {
        if (node == null) {
            return delete(node.right, (T) node.value);
        } else if (element.compareTo((T) node.value) > 0) {
            node.right = delete(node.right, element);
            return node;
        } else if (element.compareTo((T) node.value) < 0) {
            node.left = delete(node.left, element);
            return node;
        } else {
            return null;
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
            return findNodes(root, (T) element);
        }
    }

    @Override
    public boolean removeElement(Object element) {
        if (delete(root, (T) element) != null) {
            count--;
            return true;
        } else {
            return false;
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


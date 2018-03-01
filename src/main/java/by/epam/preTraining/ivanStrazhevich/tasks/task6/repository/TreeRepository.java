package by.epam.preTraining.ivanStrazhevich.tasks.task6.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.TransportRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.ITree;

import java.util.ArrayList;

public class TreeRepository<T extends Comparable<T>> extends TransportRepository implements ITree<T> {
    private Node root;
    private int count;

    public TreeRepository() {
    }

    private Object[] output(Node element) {
        ArrayList<String> result = new ArrayList<>();
        if (element.left != null) {
            Object[] temp = output(element.left);
            for (int i = 0; i < temp.length; i++) {
                result.add(" " + temp[i]);
            }
        }
        result.add(element.value.toString());
        if (element.right != null) {
            Object[] temp = output(element.right);
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

    private Node findForDeleteNodes(Node parent, T element) {
        if (parent.value.compareTo(element) == 0) {
            return parent;
        } else if (parent.value.compareTo(element) < 0) {
            if (parent.right != null) {
                return findForDeleteNodes(parent.right, element);
            }
        } else if (parent.left != null) {
            return findForDeleteNodes(parent.left, element);
        }
        return null;
    }

    @Override
    public boolean add(Object element) {
        if (root == null) {
            root = new Node(null, (T) element);
            count++;
        } else {
            root.linkNodes(root, (T) element);
            count += root.nodesNumber;
        }
        return true;
    }

    @Override
    public Object[] showOrderedElementsArray() {
        if (root != null) {
            return output(root);
        } else {
            Object[] line = {"There is no elements"};
            return line;
        }
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
        Node current;
        Node parent = root;
        current = findForDeleteNodes(parent, (T) element);
        if (current == null) {
            return false;
        }
        return true;
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

    public static class Node<E extends Comparable<E>> {
        E value;
        private int nodesNumber;
        private Node<E> left;
        private Node<E> right;
        private Node<E> parent;

        public Node(Node parent, E value) {
            this.parent = parent;
            this.value = value;
        }

        private void linkNodes(Node parent, E node) {
            if (node.compareTo(value) >= 0) {
                if (right == null) {
                    right = new Node<>(parent, node);
                    nodesNumber++;
                } else {
                    right.linkNodes(right, node);
                }
            } else {
                if (left == null) {
                    left = new Node<>(parent, node);
                    nodesNumber++;
                } else {
                    left.linkNodes(left, node);
                }
            }
        }

    }
}


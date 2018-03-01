package by.epam.preTraining.ivanStrazhevich.tasks.task6.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.TransportRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.ITree;

public class TreeRepository<T extends Comparable<T>> extends TransportRepository implements ITree<T> {
    private Node root;

    public TreeRepository() {
    }

    @Override
    public boolean add(Object element) {
        if (root == null) {
            root = new Node(null, (T) element);
        } else {
            root.linkNodes(root, (T) element);
        }
        return true;
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public boolean remove(Object element) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override

    public int count() {
        return 0;
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

        public void linkNodes(Node parent, E node) {
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


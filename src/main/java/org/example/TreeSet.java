package org.example;


import java.util.Comparator;

class Node<T> {
    T data;
    Node<T> left, right;

    public Node(T data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class TreeSet<T> {
    public Node<T> root;
    private Comparator<? super T> comparator;
    private int size ;



    public TreeSet() {
        this.root = null;
        this.size = 0;
    }

    public TreeSet(Comparator<? super T> comparator) {
        this.root = null;
        this.comparator = comparator;
        this.size = 0;
    }

    public void clear(){
        this.root = null;
        this.size = 0;
    }

    public int size(){
        return this.size;
    }

    public T last(){
        Node<T> tmp = this.root;
        while (tmp.right!=null){
            tmp = tmp.right;
        }
        return tmp.data;
    }
    public T first(){
        Node<T> tmp = this.root;
        while (tmp.left!=null){
            tmp = tmp.left;
        }
        return tmp.data;
    }
    public boolean isEmpty(){
        return this.root == null;
    }
    public boolean add(T data) {
        this.size +=1;
        if (root == null) {
            root = new Node<>(data);
            return true;
        } else {
            return addNode(root, data);
        }
    }

    private boolean addNode(Node<T> current, T data) {
        if (comparator == null) {
            @SuppressWarnings("unchecked")
            Comparable<? super T> comparableData = (Comparable<? super T>) data;
            if (comparableData.compareTo(current.data) < 0) {
                if (current.left == null) {
                    current.left = new Node<>(data);
                    return true;
                } else {
                    return addNode(current.left, data);
                }
            } else if (comparableData.compareTo(current.data) > 0) {
                if (current.right == null) {
                    current.right = new Node<>(data);
                    return true;
                } else {
                    return addNode(current.right, data);
                }
            } else {
                return false; // Duplicate data not allowed
            }
        } else {
            if (comparator.compare(data, current.data) < 0) {
                if (current.left == null) {
                    current.left = new Node<>(data);
                    return true;
                } else {
                    return addNode(current.left, data);
                }
            } else if (comparator.compare(data, current.data) > 0) {
                if (current.right == null) {
                    current.right = new Node<>(data);
                    return true;
                } else {
                    return addNode(current.right, data);
                }
            } else {
                return false; // Duplicate data not allowed
            }
        }
    }

    public boolean remove(T data) {
        int tmp = this.size();
        removeNode(root, data);
        this.size -=1;
        return this.size() == tmp;
    }

    private Node<T> removeNode(Node<T> current, T data) {
        if (current == null) {
            this.size +=1;
            return null; // Элемент не найден
        }

        if (comparator == null) {
            @SuppressWarnings("unchecked")
            Comparable<? super T> comparableData = (Comparable<? super T>) data;
            int compareResult = comparableData.compareTo(current.data);

            if (compareResult < 0) {
                current.left = removeNode(current.left, data);
            } else if (compareResult > 0) {
                current.right = removeNode(current.right, data);
            } else {
                if (current.left == null) {
                    return current.right;
                } else if (current.right == null) {
                    return current.left;
                }

                current.data = findMin(current.right).data;
                current.right = removeNode(current.right, current.data);
            }
        } else {
            int compareResult = comparator.compare(data, current.data);

            if (compareResult < 0) {
                current.left = removeNode(current.left, data);
            } else if (compareResult > 0) {
                current.right = removeNode(current.right, data);
            } else {
                if (current.left == null) {
                    return current.right;
                } else if (current.right == null) {
                    return current.left;
                }

                current.data = findMin(current.right).data;
                current.right = removeNode(current.right, current.data);
            }
        }

        return current;
    }
    private Node<T> findMin(Node<T> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    public boolean contains(T data) {
        return containsNode(root, data);
    }

    private boolean containsNode(Node<T> current, T data) {
        if (current == null) {
            return false;
        }

        if (comparator == null) {
            @SuppressWarnings("unchecked")
            Comparable<? super T> comparableData = (Comparable<? super T>) data;
            int compareResult = comparableData.compareTo(current.data);

            if (compareResult < 0) {
                return containsNode(current.left, data);
            } else if (compareResult > 0) {
                return containsNode(current.right, data);
            } else {
                return true;
            }
        } else {
            int compareResult = comparator.compare(data, current.data);

            if (compareResult < 0) {
                return containsNode(current.left, data);
            } else if (compareResult > 0) {
                return containsNode(current.right, data);
            } else {
                return true;
            }
        }
    }

    public TreeSet<T> headSet(T data) {
        TreeSet<T> subset = new TreeSet<>(this.comparator);
        if (isEmpty()) {
            return subset;
        }
        addNodeSubset(root, data, subset);
        return subset;
    }

    private void addNodeSubset(Node<T> current, T toElement, TreeSet<T> subset) {
        if (current != null) {
            if (comparator == null) {
                @SuppressWarnings("unchecked")
                Comparable<? super T> comparableData = (Comparable<? super T>) toElement;
                if (comparableData.compareTo(current.data) > 0) {
                    subset.add(current.data);
                    addNodeSubset(current.right, toElement, subset);
                }
                addNodeSubset(current.left, toElement, subset);
            } else {
                if (comparator.compare(toElement, current.data) > 0) {
                    subset.add(current.data);
                    addNodeSubset(current.right, toElement, subset);
                }
                addNodeSubset(current.left, toElement, subset);
            }
        }
    }

    public TreeSet<T> tailSet(T fromElement) {
        TreeSet<T> subset = new TreeSet<>(this.comparator);
        if (isEmpty()) {
            return subset;
        }
        addNodeTailSet(root, fromElement, subset);
        return subset;
    }

    private void addNodeTailSet(Node<T> current, T fromElement, TreeSet<T> subset) {
        if (current != null) {
            if (comparator == null) {
                @SuppressWarnings("unchecked")
                Comparable<? super T> comparableData = (Comparable<? super T>) fromElement;
                if (comparableData.compareTo(current.data) <= 0) {
                    subset.add(current.data);
                    addNodeTailSet(current.right, fromElement, subset);
                }
                addNodeTailSet(current.left, fromElement, subset);
            } else {
                if (comparator.compare(fromElement, current.data) <= 0) {
                    subset.add(current.data);
                    addNodeTailSet(current.right, fromElement, subset);
                }
                addNodeTailSet(current.left, fromElement, subset);
            }
        }
    }
}
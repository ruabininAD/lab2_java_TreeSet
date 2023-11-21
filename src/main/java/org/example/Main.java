package org.example;
import java.util.Comparator;


public class Main{
    // Метод для вывода содержимого дерева в порядке обхода
    private static void printInOrder(Node<?> node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }


    public static void main(String[] args) {
        // Пример использования TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(2);


        // Пример вывода содержимого дерева в порядке обхода
        // В этом примере - это обход в глубину (in-order traversal)
        System.out.println("Содержимое TreeSet:");
        printInOrder(treeSet.root);
        System.out.println("\nTreeSet.first():" + treeSet.first());
        System.out.println("  TreeSet.last():" + treeSet.last());
        System.out.println("  TreeSet.size():" + treeSet.size());


        boolean a = treeSet.remove(2);
        System.out.println("\ntreeSet.remove: "+ a);

        System.out.println("Содержимое TreeSet:");
        printInOrder(treeSet.root);
        System.out.println("\nTreeSet.first():" + treeSet.first());
        System.out.println("  TreeSet.last():" + treeSet.last());
        System.out.println("  TreeSet.size():" + treeSet.size());

        printInOrder(treeSet.headSet(6).root);
        System.out.println();
        printInOrder(treeSet.tailSet(5).root);
    }



}



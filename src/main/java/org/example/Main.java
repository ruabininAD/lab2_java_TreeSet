package org.example;


public class Main{
    private static void myTest(){
        // Пример использования TreeSet
        CustomTreeSet<Integer> treeSet = new CustomTreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(2);


        // Пример вывода содержимого дерева в порядке обхода
        // В этом примере - это обход в глубину (in-order traversal)
        System.out.print("Содержимое TreeSet:"+treeSet);

        System.out.println("\nTreeSet.first():" + treeSet.first());
        System.out.println("  TreeSet.last():" + treeSet.last());
        System.out.println("  TreeSet.size():" + treeSet.size());


        boolean a = treeSet.remove(2);
        System.out.println("\ntreeSet.remove: "+ a);

        System.out.print("Содержимое TreeSet:"+ treeSet);

        System.out.println("\nTreeSet.first():" + treeSet.first());
        System.out.println("TreeSet.last():" + treeSet.last());
        System.out.println("TreeSet.size():" + treeSet.size());

        System.out.println("treeSet.headSet(6) = "+treeSet.headSet(6).toString());
        System.out.println();
        System.out.println("treeSet.tailSet(5) = "+treeSet.tailSet(5).toString());
    }

    public static void testAddElements() {
        CustomTreeSet<Integer> customSet = new CustomTreeSet<>();
        // Добавление элементов
        customSet.add(5);
        customSet.add(2);
        customSet.add(8);

        // Проверка размера и содержания
        if ( customSet.size() != 3 ) {            System.out.println(  "Размер должен быть 3");}
        if (  !customSet.contains(5) ) {            System.out.println(  "Должен содержать 5");}
        if (  !customSet.contains(2) ) {            System.out.println(  "Должен содержать 2");}
        if (  !customSet.contains(8) ) {            System.out.println(  "Должен содержать 8");}
    }

    public static void testRemoveElements() {
        CustomTreeSet<Integer> customSet = new CustomTreeSet<>();
        customSet.add(5);
        customSet.add(2);
        customSet.add(8);

        // Удаление элемента
        customSet.remove(5);

        // Проверка размера и отсутствия удаленного элемента
        if (  customSet.size() != 2 ) {            System.out.println( "Размер должен быть 2");}
        if (  customSet.contains(5)  ) {            System.out.println( "Не должен содержать 5");}
    }

    public static void testClean() {
        CustomTreeSet<Integer> customSet = new CustomTreeSet<>();
        customSet.add(5);
        customSet.add(2);
        customSet.add(8);


        customSet.clear();


        if ( !customSet.isEmpty() ) {            System.out.println( "После удаления должен быть пустой");}
        if ( customSet.contains(5) ) {            System.out.println( "Не должен содержать 5");}
    }


    public static void testIsEmpty() {
        CustomTreeSet<Integer> customSet = new CustomTreeSet<>();
        if (!customSet.isEmpty()) {            System.out.println("Должен быть пустым");}

        customSet.add(10);
        if ( customSet.isEmpty()) {        System.out.println("Не должен быть пустым");}
    }

    public static void testSize() {
        CustomTreeSet<Integer> customSet = new CustomTreeSet<>();
        if (  !customSet.isEmpty() ) {        System.out.println( "Должен быть пустым");}
        customSet.add(5);
        customSet.add(2);
        customSet.add(8);
        customSet.add(10);

        if ( customSet.size() != 4) {        System.out.println( "Размер должен быть 4");}

        customSet.contains(2);
        customSet.remove(5);
        if ( customSet.size() != 3) {        System.out.println( "Размер должен быть 3");}



        customSet.clear();
        if (!customSet.isEmpty()) {        System.out.println( "Размер должен быть 0");}

    }


    public static void testFirstLast() {
        CustomTreeSet<Integer> customSet = new CustomTreeSet<>();
        if (  !customSet.isEmpty() ) {        System.out.println( "Должен быть пустым");}
        customSet.add(5);
        customSet.add(2);
        customSet.add(8);
        customSet.add(10);



        if (customSet.first() != 2) {        System.out.println( "Наименьший должен быть 2");}
        if (customSet.last() != 10) {        System.out.println( "Наибольший должен быть 10");}



        System.out.println((customSet));
    }


    public static void main(String[] args) {
        myTest();

        testAddElements();
        testRemoveElements();
        testIsEmpty();
        testClean();
        testFirstLast();
        testSize();


    }

}



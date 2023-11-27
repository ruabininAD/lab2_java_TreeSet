package org.example;

import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class CustomTreeSetTest {

    @org.junit.jupiter.api.Test
    void clear() {
        CustomTreeSet<Integer> my_test = new CustomTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();

        int[] array = {12,3,4, -1, -3, -3, -3, -5,34};
        for (int element : array) {
            my_test.add(element);
            test.add(element);
        }

        my_test.clear();
        test.clear();

        Assertions.assertEquals(test.size(), my_test.size());
        System.out.println("Size test successful complete for remove");
    }

    @org.junit.jupiter.api.Test
    void size() {
        CustomTreeSet<Integer> my_test = new CustomTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();

        Assertions.assertEquals(test.size(), my_test.size());
        System.out.println("Size test successful complete for size");

        int[] array = {12,3,4, -1, -3, -3, -3, -5,34};
        for (int element : array) {
            my_test.add(element);
            test.add(element);
        }

        Assertions.assertEquals(test.size(), my_test.size());
        System.out.println("Size test successful complete for last");

    }

    @org.junit.jupiter.api.Test
    void last() {
        CustomTreeSet<Integer> my_test = new CustomTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();

        int[] array = {12,3,4, -1, -3, -3, -3, -5,34};
        for (int element : array) {
            my_test.add(element);
            test.add(element);
        }



        Assertions.assertEquals(test.last(), my_test.last());
        System.out.println("Equals test successful complete for last");
        Assertions.assertEquals(test.last(), my_test.last());
        System.out.println("Equals test successful complete for last");

    }

    @org.junit.jupiter.api.Test
    void first() {
        CustomTreeSet<Integer> my_test = new CustomTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();

        int[] array = {12,3,4, -1, -3, -3, -3, -5,34};
        for (int element : array) {
            my_test.add(element);
            test.add(element);
        }



        Assertions.assertEquals(test.first(), my_test.first());
        System.out.println("Equals test successful complete for first");
        Assertions.assertEquals(test.first(), my_test.first());
        System.out.println("Equals test successful complete for first");

    }

    @org.junit.jupiter.api.Test
    void isEmpty() {

        CustomTreeSet<Integer> my_test = new CustomTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();

        Assertions.assertEquals(test.size(), my_test.size());
        System.out.println("Size test successful complete for isEmpty");

        my_test.add(2);
        test.add(2);


        Assertions.assertEquals(test.contains(1), my_test.contains(1));
        System.out.println("Equals test successful complete for isEmpty");

        my_test.clear();
        test.clear();

        Assertions.assertEquals(test.isEmpty(), my_test.isEmpty());
        System.out.println("Equals test successful complete for isEmpty");





    }

    @org.junit.jupiter.api.Test
    void add() {

        CustomTreeSet<Integer> my_test = new CustomTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();

        int[] array = {12,3,4, -1, -3, -3, -3, -5,34};
        for (int element : array) {
            my_test.add(element);
            test.add(element);
        }


        Assertions.assertEquals(test.size(), my_test.size());
        System.out.println("Size test successful complete for add");

        for (int element : array) {
            Assertions.assertEquals(test.contains(element), my_test.contains(element));
        }
        System.out.println("Equals test successful complete for add");
    }

    @org.junit.jupiter.api.Test
    void remove() {

        CustomTreeSet<Integer> my_test = new CustomTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();

        int[] array = {12,3,4, -1, -3, -3, -3, -5,34};
        for (int element : array) {
            my_test.add(element);
            test.add(element);
        }

        Assertions.assertEquals(test.size(), my_test.size());
        System.out.println("Size test successful complete for remove");


        my_test.remove(12);
        test.remove(12);

        Assertions.assertEquals(test.size(), my_test.size());
        System.out.println("Size test successful complete  for remove");


        Assertions.assertEquals(my_test.remove(12), test.remove(12));
        System.out.println("Equals test successful complete  for remove");

        Assertions.assertEquals(my_test.remove(34), test.remove(34));
        System.out.println("Equals test successful complete  for remove");

    }

    @org.junit.jupiter.api.Test
    void contains() {
        CustomTreeSet<Integer> my_test = new CustomTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();

        int[] array = {12,3,4, -1, -3, -3, -3, -5,34};
        for (int element : array) {
            my_test.add(element);
            test.add(element);
        }

        for (int element : array) {
            Assertions.assertEquals(test.contains(element), my_test.contains(element));
        }
        System.out.println("Equals test successful complete for contains");

    }

    @org.junit.jupiter.api.Test
    void headSet() {

        CustomTreeSet<Integer> my_test = new CustomTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();

        int[] array = {12,3,4, -1, -3, -3, -3, -5,34};
        for (int element : array) {
            my_test.add(element);
            test.add(element);
        }


        for (int element : array) {
            //Assertions.assertEquals(test.headSet(element).size(), my_test.headSet(element).size());
            //it is not possible to compare data of different types
            Assertions.assertEquals(test.headSet(element).size(), my_test.headSet(element).size());
            System.out.println("Equals test successful complete for headSet");
        }

    }

    @org.junit.jupiter.api.Test
    void tailSet() {

        CustomTreeSet<Integer> my_test = new CustomTreeSet<>();
        TreeSet<Integer> test = new TreeSet<>();

        int[] array = {12,34, 3, -5};
        for (int element : array) {
            my_test.add(element);
            test.add(element);
        }



        for (int element : array) {
            //Assertions.assertEquals(test.headSet(element).size(), my_test.headSet(element).size());
            //it is not possible to compare data of different types


            Assertions.assertEquals(test.tailSet(element).size(),  my_test.tailSet(element).size());
            System.out.println("Equals test successful complete for tailSet: element="+element+" - "+ my_test.tailSet(element).toString());
        }


    }
}
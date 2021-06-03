package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    static Random r = new Random();


    public static void main(String[] args) {
        /*
         * Call your sorting and searching Algorithms here...
         *
         * */
        ArrayList<Integer> large = largeBatch();
        ArrayList<Integer> small = smallBatch();
        ArrayList<Integer> expectedLrg = expected(large);
        ArrayList<Integer> expectedSml = expected(small);

        /*
        ----------------------------------------------------------
        |                       Warmup                           |
        ----------------------------------------------------------
         */

//        1. Linear Search Algorithm
//        System.out.println(Search.linearSearchSort(large, 0));
//        System.out.println(large);
//
//        System.out.println(Search.linearSearchSort(small, 8));
//        System.out.println(small);
//        2. Selection Sort Algorithm
//        System.out.println(small);
//        ArrayList<Integer> values = Sort.selectionSort(small);
//        for (int value : values) {
//            System.out.print(value + ", ");
//        }

/*
        ----------------------------------------------------------
        |                       First Wave                       |
        ----------------------------------------------------------
*/

//        1. Binary Search Algorithm
//        System.out.println(Sort.binarySearch(13, expectedLrg));

//        2. Insertion Sort Algorithm
//        System.out.println(Sort.insertionSort(large));

//        3. Bubble Sort Algorithm
//        System.out.println(Sort.bubbleSort(small));
    }

    public static ArrayList<Integer> largeBatch() {
        ArrayList<Integer> largeBatch = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {

            largeBatch.add(r.nextInt(10000));
        }
        return largeBatch;
    }

    public static ArrayList<Integer> smallBatch() {
        ArrayList<Integer> smallBatch = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            smallBatch.add(r.nextInt(100));
        }
        return smallBatch;
    }

    public static ArrayList<Integer> expected(ArrayList<Integer> unsorted) {
        ArrayList<Integer> sorted = (ArrayList<Integer>) unsorted.clone();
        Collections.sort(sorted);
        return sorted;
    }
}

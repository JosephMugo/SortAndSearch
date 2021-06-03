package com.company;

import java.util.ArrayList;

public class Sort {
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> values) {
        // find min in array
        // place at beginning
        for (int x = 0; x < values.size(); x++) {
            // get index
            int min = values.get(x);
            for (int y = x; y < values.size(); y++) {
                // check for min
                if (values.get(y) < min) {
                    // swap
                    min = values.get(y);
                    int placeholder = values.get(x);
                    values.set(x, values.get(y));
                    values.set(y, placeholder);
                }
            }
        }
        return values;
    }

    // Watched https://www.youtube.com/watch?v=6ysjqCUv3K4 to get help on solution
    // I implemented his logic into my solution
    public static int binarySearch(int target, ArrayList<Integer> values) {
        System.out.println("Binary Search");
        System.out.println("--------------");
        System.out.println("Looking for: " + target);
        System.out.println("values: " + values);
        System.out.println("--------------");

        int left = 0;
        int right = values.size() - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (values.get(middle) == target) {
                return middle;
            } else if (values.get(middle) > target) {
                right = middle - 1;
            } else if (values.get(middle) < target) {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> values) {

        for (int x = 1; x < values.size(); x++) {
            int max = values.get(x);
            int start = x;
            for (int y = x - 1; y >= 0; y--) {
                // x (parent) < y
                if (values.get(y) > max) {
                    int placeholder = max;
                    // x ---> y
                    values.set(start, values.get(y));
                    // y ---> x
                    values.set(y, placeholder);
                    start = y;
                } else {
//                    break;
                }
            }
        }
        return values;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> values) {
        boolean isNotReady = true;
        while (isNotReady) {
            isNotReady = false;
            for (int x = 0; x < values.size() - 1; x++) {
                if (values.get(x) > values.get(x + 1)) {
                    int placeholder = values.get(x);
                    values.set(x, values.get(x + 1));
                    values.set(x + 1, placeholder);
                    isNotReady = true;
                }
            }
        }
        return values;
    }
}

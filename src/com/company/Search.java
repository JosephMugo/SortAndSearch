package com.company;

import java.util.ArrayList;

public class Search {
    public static int linearSearchSort(ArrayList<Integer> values, int searchValue) {
        int x = 0;
        for (int value : values) {
            if (value == searchValue) {
                return x;
            }
            x++;
        }
        return -1;
    }
}

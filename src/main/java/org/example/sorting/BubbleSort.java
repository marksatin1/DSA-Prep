package org.example.sorting;

import java.util.Arrays;

import static org.example.sorting.Utility.swapArrValues;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 90, -34, 17, 0, 6, 9, 22};
        System.out.println(Arrays.toString(bubbleSortRec(arr, arr.length-1, 0)));
    }

    // col is outer loop pass
    // row is inner loop pass
    // see Q3 here:  https://www.youtube.com/watch?v=ymgnIIclCF0&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=29
    static int[] bubbleSortRec(int[] arr, int row, int col) {
        if (row == 0) {
            return arr;
        }

        if (col < row) {
            if (arr[col] > arr[col+1]) {
                swapArrValues(arr, col, col+1);
            }
            return bubbleSortRec(arr, row, ++col);
        } else {
            return bubbleSortRec(arr, --row, 0);
        }
    }
}

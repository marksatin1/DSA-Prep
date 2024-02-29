package org.example.sorting;

import java.util.Arrays;

import static org.example.sorting.Utility.swapArrValues;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 90, -34, 17, 0, 6, 9, 6};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find max item in remaining arr and swap with correct index
            int lastIdx = arr.length - i - 1;
            int maxIdx = getMaxValueIdx1(arr, 0, lastIdx);
            swapArrValues(arr, maxIdx, lastIdx);
        }
        return arr;
    }

    // Returns the index of the max value in arr
    static int getMaxValueIdx1(int[] arr, int start, int end) {
        int maxIdx = start;

        for (int i = start+1; i <= end; i++) {
            if (arr[maxIdx] < arr[i]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }


    // THIS NEEDS WORK
//    static int[] selectionSortRec(int[] arr, int s, int e, int count) {
//        if (s > e) {
//            return arr;
//        }
//
//        int maxIdx = getMaxValueIdx2(arr, s, e);
//        int lastIdx = arr.length - count - 1;
//
//        // swap values
//        int temp = arr[lastIdx];
//        arr[lastIdx] = arr[maxIdx];
//        arr[maxIdx] = temp;
//
//        return selectionSortRec(arr, s, --e, ++count);
//    }
//
//    static int getMaxValueIdx2(int[] arr, int s, int e) {
//        int maxValue = arr[s];
//        int maxValueIdx = -1;
//
//        for (int i = s+1; i < e; i++) {
//            if (arr[i] > maxValue) {
//                maxValue = arr[i];
//                maxValueIdx = i;
//            }
//        }
//        return maxValueIdx;
//    }
}

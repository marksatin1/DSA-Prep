package org.example.recursion;

// https://www.youtube.com/watch?v=sTdiMLom00U&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=28

import java.util.ArrayList;

public class RecArrayQuestions {
    public static void main(String[] args) {
        int[] arr = {-8, 4, -9, 12, 4, 5, 4, 4};
        System.out.println(findAllIndexes2(arr, 4, 0));
    }


    // Q1
    static boolean isArraySorted(int[] arr, int idx) {
        if (idx == arr.length-1) {
            return true;
        }

        if (arr[idx] <= arr[idx+1]) {
            return isArraySorted(arr, idx+1);
        } else {
            return false;
        }
    }

    // Q2
    static int linearSearch(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == target) {
            return idx;
        } else {
            return linearSearch(arr, target, ++idx);
        }
    }

    // Q3 & Q4
    static ArrayList<Integer> findAllIndexes1(int[] arr, int target, int idx, ArrayList<Integer> ansList) {
        if (idx == arr.length) {
            return ansList;
        }

        if (arr[idx] == target) {
            ansList.add(idx);
        }

        return findAllIndexes1(arr, target, ++idx, ansList);
    }

    // Q5
    // Much less space efficient than Q4 approach
    static ArrayList<Integer> findAllIndexes2(int[] arr, int target, int idx) {
        ArrayList<Integer> ansList = new ArrayList<>();

        if (idx == arr.length) {
            return ansList;
        }

        // this ansList will contain answer for this function call only
        if (arr[idx] == target) {
            ansList.add(idx);
        }

        ArrayList<Integer> answersFromBelowCalls = findAllIndexes2(arr, target, ++idx);
        ansList.addAll(answersFromBelowCalls);
        return ansList;
    }
}

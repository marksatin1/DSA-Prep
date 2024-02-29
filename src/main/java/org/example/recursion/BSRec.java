package org.example.recursion;

// Recursive Binary Search
public class BSRec {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 9, 13, 76};
        System.out.println(rotatedBSRec(arr, 2, 0, arr.length-1));
    }

    static int bsRec(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return bsRec(arr, target, start, mid-1);
        } else {
            return bsRec(arr, target, mid+1, end);
        }
    }

    // Rotated binary search with recursion
    static int rotatedBSRec(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s)/2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return rotatedBSRec(arr, target, s, --m);
            } else {
                return rotatedBSRec(arr, target, ++m, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return rotatedBSRec(arr, target, ++m, e);
        } else {
            return rotatedBSRec(arr, target, s, --m);
        }
    }
}

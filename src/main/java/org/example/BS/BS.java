package org.example.BS;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 23, 49, 426, 980};
        int[] arrDesc = {12, 11, 10, 8, 6};
        int target = 8;
        System.out.println(orderAgnosticBS(arrDesc, target));
    }

    // array is sorted in ASCENDING order
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        boolean asc = arr[start] <= arr[end];

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (asc ? arr[mid] < target : arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

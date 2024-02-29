package org.example.bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 4, 8, 1, 5};
        System.out.println(findUnique(arr));
    }

    // Potential Issue: any number that appears odd number of times will be considered unique
    // This only works if there is guaranteed one unique number
    static int findUnique(int[] arr) {
        int unique = 0;

        for (int i : arr) {
            unique ^= i;
        }

        if (unique == 0) {
            System.out.println("No unique number found.");
            return -1;
        }

        return unique;
    }
}

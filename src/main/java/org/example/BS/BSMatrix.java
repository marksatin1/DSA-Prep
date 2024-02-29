package org.example.BS;

import java.util.Arrays;

// Kunal Kushwaha BS in 2D Array (matrix)
// https://www.youtube.com/watch?v=enI_KyGLYPo&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=16

public class BSMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 8;
        System.out.println(Arrays.toString(searchRowColSortedMatrix(matrix, target)));
    }

    // Q1: Rows and Cols are independently sorted in a square array
    static int[] searchRowColSortedMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }

            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }

    // Q2: Completely sorted matrix
//    static int[] searchAllSortedMatrix(int[][] matrix, int target) {
//
//    }
}

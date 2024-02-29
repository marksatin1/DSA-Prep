package org.example.patterns;

//  Kunal Kushwaha Patterns Homework
//  https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class Patterns {
    public static void main(String[] args) {
        pattern3Rec(5, 0);
    }

    static void pattern1 (int n) {
        // print rows
        for (int row = 0; row < n; row++) {
            // print cols
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }

            // print new line
            System.out.println();
        }
    }

    static void pattern2(int n) {
        // print each row
        for (int row = 0; row < n; row++) {
            // print each col
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }

            // print a new line
            System.out.println(" ");
        }
    }

    // Assumes rows are counted from n to 1
    static void pattern2Rec(int row, int col) {
        // base case
        if (row == 0) {
            return;
        }

        // driver code
        if (col < row) {
            pattern3Rec(row, ++col);
            System.out.print("*");
        } else {
            pattern3Rec(--row, 0);
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    // Assumes rows are counted from n to 1
    static void pattern3Rec(int row, int col) {
        // base case
        if (row == 0) {
            return;
        }

        // driver code
        if (col < row) {
            System.out.print("*");
            pattern3Rec(row, ++col);
        } else {
            System.out.println();
            pattern3Rec(--row, 0);
        }
    }

    static void pattern4(int n) {
        int counter = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(counter + " ");
                counter++;
            }
            counter = 1;
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 0; row < n; row++) {
            // print spaces
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }

            // print stars
            for (int star = 0; star < n - row; star++) {
                System.out.print("*");
            }

            //print new line
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            // print spaces
            for (int col = 1; col < n - row + 1; col++) {
                System.out.print(" ");
            }

            // print stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }

            for (int col = 2*n - 2*row + 1; col > 0; col--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            int totalRows = n - totalCols;

            // print spaces
            for (int space = 1; space <= totalRows; space++) {
                System.out.print(" ");
            }

            // print numbers left
            for (int col = totalCols; col >= 1; col--) {
                System.out.print(col);
            }

            // print numbers right
            for (int col = 2; col <= totalCols; col++) {
                System.out.print(col);
            }

            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            int totalSpaces = n - totalCols;

            for (int space = 0; space < totalSpaces; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern31(int n) {
        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col < 2 * n; col++) {
                int value = n - Math.min(Math.min(row-1, col-1), Math.min(2*n-row-1, 2*n-col-1));
                System.out.print(value);
            }
            System.out.println();
        }
    }
}

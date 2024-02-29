package org.example.recursion;

// Kunal Kushwaha
// https://www.youtube.com/watch?v=JxILxTwHukM&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=27

public class RecQuestions {
    public static void main(String[] args) {
        System.out.println(countSteps(1, 0));
    }

    // Q1
    static void nToOne(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        nToOne(n-1);
    }

    // Q2
    static void oneToN(int n) {
        if (n == 0) {
            return;
        }

        oneToN(n-1);
        System.out.println(n);
    }

    // Q3
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n-1);
    }

    // Q4
    static int sumNTo1(int n) {
        if (n <= 1) {
            return 1;
        }

        return n + sumNTo1(n-1);
    }

    // Q5
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigits(n/10);
    }

    // Q6
    static int productOfDigits(int n) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * productOfDigits(n/10);
    }

    // Q7 version 1
    static int sum = 0;
    static void reverseNum1(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNum1(n/10);
    }

    // Q7 version 2
    static int reverseNum2(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return reverseNumHelper(n, digits);
    }

    private static int reverseNumHelper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + reverseNumHelper(n/10, digits-1);
    }

    // Q8
    static boolean isPalindrome(int n) {
        return n == reverseNum2(n);
    }

    // Q9
    // Assumes n >= 1
    static int countZeros(int n, int count) {
        if (n == 0) {
            return count;
        }

        if (n % 10 == 0) {
            count++;
        }

        return countZeros(n/10, count);
    }

    // Q10
    static int countSteps(int n, int count) {
        if (n == 0) {
            return count;
        }

        if ((n & 1) == 0) {
            return countSteps(n / 2, ++count);
        } else {
            return countSteps(--n, ++count);
        }
    }
}

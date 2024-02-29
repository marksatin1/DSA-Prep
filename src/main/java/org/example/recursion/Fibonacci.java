package org.example.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibIter(9));
    }

    // return the nth fib number
    static int fibRec(int n) {
        if (n < 2) {
            return n;
        }
        return fibRec(n-1) + fibRec(n-2);
    }

    static int fibIter(int n) {
        if (n < 2) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }


}

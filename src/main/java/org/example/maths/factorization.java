package org.example.maths;

import java.util.ArrayList;
import java.util.List;

public class factorization {
    public static void main(String[] args) {
        System.out.println(lcm(3, 6));
    }

    // Slower, but sorted
    static void getFactors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Faster, but not sorted
    static void getFactors2(int n) {
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    // As fast as gF2 and sorted, but with more aux space used
    static void getFactors3(int n) {
        List<Integer> ints = new ArrayList<>();

        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    ints.add(n/i);
                }
            }
        }

        for (int i = ints.size() - 1; i > 0; i--) {
            System.out.print(ints.get(i) + " ");
        }
    }

    // Find the Greatest Common Denominator of two numbers
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    // Find the Least Common Multiple of two numbers
    static int lcm(int a, int b) {
        return a*b / gcd(a, b);
    }
}

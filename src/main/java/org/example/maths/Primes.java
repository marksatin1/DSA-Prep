package org.example.maths;

public class Primes {
    public static void main(String[] args) {
        int n = 400;
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }

    // Determine if number n is prime (v1)
    static boolean isPrime1(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Determine if number n is prime (v2)
    static boolean isPrime2(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    // Find all primes <= n (v1)
    static void findAllPrimes(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + isPrime1(i));
        }
    }

    // Sieve of Eratosthenes: find all primes <= n (v2)
    // more performant
    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i*i <= n; i++) {
            // boolean array initializes every value as false
            if (!primes[i]) {
                for (int j = i*2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

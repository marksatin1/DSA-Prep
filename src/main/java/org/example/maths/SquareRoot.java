package org.example.maths;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(newtonSqRoot(50));
    }

    static int findSqRootPerfect(int n) {
        if (n < 0) {
            return -1;
        }

        int start = 0;
        int end = n;

       while (start <= end) {
           int mid = start + (end - start) / 2;

           if (mid*mid == n) {
               return mid;
           }

           if (mid*mid > n) {
               end = mid - 1;
           } else {
               start = mid + 1;
           }
       }
       return -1;
    }

    // Return square root with precision p
    static double findSqRootPrecise(int n, int p) {
        if (n < 0 || p < 0) {
            return -1;
        }

        int start = 0;
        int end = n;
        int mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid*mid == n) {
                return mid;
            }

            if (mid*mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Iterate for each level of precision
        double root = (double) end;
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root*root <= n) {
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }

        return root;
    }

    // Newton-Raphson method to find square root
    static double newtonSqRoot(double n) {
        double x = n;
        double root = 0.00;

        while (true) {
            root = 0.5 * (x + n/x);      // this is the Newton-Raphson formula

            // check for magnitude of error (distance between guess and actual)
            if (Math.abs(root - x) < 1) {
                break;
            }

            x = root;

        }
        return root;
    }
}

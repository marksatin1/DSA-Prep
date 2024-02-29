package org.example.BS;

public class BSQuestions {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(validPerfectSquare(n));
    }

    static boolean validPerfectSquare(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int s = 1;
        int e = n;
        int mid = -1;

        while (s <= e) {
            mid = s + (e-s)/2;
            if ((long)mid*mid > (long)n) {
                e = mid-1;
            } else if (mid*mid < n) {
                s = mid+1;
            } else {
                return true;
            }
        }
        return false;
    }
}

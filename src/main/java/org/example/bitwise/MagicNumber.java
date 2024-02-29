package org.example.bitwise;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 41;
        int base = 5;
//        System.out.println(magicNumber(n, base));
    }

    static int magicNumber(int n, int base) {
        int ans = 0;
        int last;

        while (n > 0) {
            last = n & 1;           // masks n to return the rightmost binary digit
            ans += last * base;     // multiplies that digit by the base and adds it to ans
            n = n >> 1;             // right shift binary number to get next binary digit
            base *= base;           // multiply base times itself to get next power of base
        }

        return ans;
    }
}

package org.example.bitwise;

public class IthBit {
    public static void main(String[] args) {
        int n = 141;
        int bit = 3;
        System.out.println(resetIthBit(n, bit));
        System.out.println(findIthBit(n, bit));
    }

    // Returns the bit at that location
    static int findIthBit(int n, int bit) {
        return (n & (1 << (bit-1))) >> (bit-1);
    }

    // Returns number in decimal form once the binary form has had its bit set to 1
    // "bit set" means the bit becomes 1 regardless of whether it was originally 1 or 0
    static int setIthBit(int n, int bit) {
        return n | (1 << bit-1);
    }

    // Returns number in decimal form once the binary form has had its bit reset to 0
    // "bit reset" means the bit becomes 0 regardless of whether it was originally 1 or 0
    static int resetIthBit(int n, int bit) {
        return n & ~(1 << (bit-1));
    }
}

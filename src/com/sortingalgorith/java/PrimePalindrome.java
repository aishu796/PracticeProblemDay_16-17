package com.sortingalgorith.java;

public class PrimePalindrome {
    boolean isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            return true;
        else
            return false;
    }

    boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp= temp / 10;
        }
        if (n == rev)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        PrimePalindrome ob = new PrimePalindrome();
        for (int i = 0; i <= 1000; i++) {
            if (ob.isPrime(i) && ob.isPalindrome(i)) {
                System.out.print(i + "   ");
            }
        }
    }
}

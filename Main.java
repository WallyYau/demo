package com.wyau;

// Code to show how recursion works
public class Main {

    // this is a function to calculate
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}

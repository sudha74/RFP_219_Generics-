package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {
        MaxInt maxInt = new MaxInt();
        System.out.println("Test case1");
        maxInt.maxValue(7, 5, 6);
        System.out.println("Test case2");
        maxInt.maxValue(5, 6, 4);
        System.out.println("Test case3");
        maxInt.maxValue(5, 6, 8);
    }
}


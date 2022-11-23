package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {
        MaxValue maxValue = new MaxValue();
        System.out.println("Integer Test case1");
        maxValue.maxValue(5, 4, 3);
        System.out.println("Integer Test case2");
        maxValue.maxValue(5, 6, 3);
        System.out.println("Integer Test case3");
        maxValue.maxValue(5, 4, 7);
        System.out.println("Float Test case1");
        maxValue.maxValue(5.2F, 4.3F, 3.2F);
        System.out.println("Float Test case2");
        maxValue.maxValue(5.2F, 6.3F, 3.2F);
        System.out.println("Float Test case3");
        maxValue.maxValue(5.2F, 4.3F, 7.2F);
        System.out.println("String Test case1");
        maxValue.maxValue("Peach", "Apple", "Banana");
        System.out.println("String Test case2");
        maxValue.maxValue("Apple", "Zach", "Banana");
        System.out.println("String Test case3");
        maxValue.maxValue("Apple", "Banana", "Class");
    }
}



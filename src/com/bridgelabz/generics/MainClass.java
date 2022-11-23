package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {
        MaxValue<Integer> maxValue1 = new MaxValue<>(5, 4, 3);
        maxValue1.testMaximum();
        MaxValue<Float> maxValue2 = new MaxValue<>(5.2F, 8.3F, 3.2F);
        maxValue2.testMaximum();
        MaxValue<String> maxValue3 = new MaxValue<>("Peach", "Apple", "Zach");
        maxValue3.testMaximum();
    }
}



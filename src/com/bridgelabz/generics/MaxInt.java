package com.bridgelabz.generics;

public class MaxInt {
    void maxValue(Integer val1, Integer val2, Integer val3) {
        if ((val1.compareTo(val2)) >= 0 && (val1.compareTo(val3)) >= 0) {
            System.out.println(val1 + " " + " is the largest");
        } else if ((val2.compareTo(val1)) >= 0 && (val2.compareTo(val3)) >= 0) {
            System.out.println(val2 + " " + "is the largest");
        } else {
            System.out.println(val3 + " " + "is the largest");
        }
    }
}

package org.theikchan;

import java.util.ArrayList;
import java.util.List;

public class UnboxingDemo {

    public static void main(String[] args) {
        Integer i = Integer.valueOf(-8);

        // 1. Unboxing through method invocation
        int absVal = absoluteValue(i);
        IO.println("absolute value of " + i + " = " + absVal);

        List<Double> doubles = new ArrayList<>();
        doubles.add(3.1416);    // Π is autoboxed through method invocation.

        // 2. Unboxing through assignment
        double pi = doubles.get(0);
        IO.println("pi = " + pi);
    }

    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }
}
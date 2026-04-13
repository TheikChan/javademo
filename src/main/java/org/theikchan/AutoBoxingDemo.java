package org.theikchan;

import java.util.ArrayList;
import java.util.List;


// Primitive type - Wrapper class
// boolean - Boolean
// byte - Byte
// char - Character
// float - Float
// int - Integer
// long - Long
// short - Short
// double - Double

public class AutoBoxingDemo {


    // unboxing
    public static int sumEven(List<Integer> ints) {
        int sum = 0;
        for (Integer i: ints) {
            if (i % 2 == 0) { // if(i.intValue()%2==0) {
                sum+=i; // sum+=i.intValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // autoboxing
        Character ch = 'a'; // Java compiler will auto convert char into Character object

        List<Integer> ints = new ArrayList<>();
        for (int i = 1; i < 50; i += 2)
            ints.add(i); // ints.add(Integer.valueOf(i)); Java compiler will auto convert i=int into Integer object before adding it
    }
}

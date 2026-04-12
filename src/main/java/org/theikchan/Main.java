package org.theikchan;

import java.util.Arrays;
import java.util.List;

 import static java.lang.IO.*;
//  import static java.lang.IO.print;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public int calculate(Day d) {
        return switch (d) {
            case SATURDAY, SUNDAY -> 0;
            default -> {
                int remainingWorkDays = 5 - d.ordinal();
                yield remainingWorkDays;
            }
        };
    }

    public String convertToLabel(int quarter) {
        return switch (quarter) {
            case 0 -> {
                System.out.println("Q1 - Winter");
                yield "Q1 - Winter";
            }
            default -> "Unknown quarter";
        };
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        int[] numbers =
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : numbers) {
            if (item == 5)
                break;

            if (item == 8)
                continue;

            System.out.println("Count is: " + item);
        }


        var name = "Theik Chan";

        Arrays.stream(numbers)
                .filter(n -> n % 4 == 0)
                .forEach(System.out::println);

         println("hello");


         // Variable and data type
         boolean result = false;
         char capitalC = 'C';
         byte b = 100;
         short s = 10000;
         int i = 10000;

         int decimalValue = 26;
         int hexadecimalValue = 0x1a;
         int binaryValue = 0b11010;

         double d1 = 123.4;
         double d2 = 1.234e2;
         float f1 = 123.4f;

         long creditCardNumber = 1234_5678_9012_3456L;
         long socialSecurityNumber = 999_99_9999L;
         float pi = 3.14_15f;
         long hexBytes = 0xFF_EC_DE_5E;
         long hexWords = 0xCAFE_BABE;
         long maxLong = 0x7fff_ffff_ffff_ffffL;
         byte nybbles = 0b0010_0101;
         long bytes = 0b11010010_01101001_10010100_10010010;

         // Array  
         int[] intArray = new int[10];
         intArray[0] = 100;
         intArray[9] = 900;

        println(intArray[0]);
        println(intArray[9]);
 
        for (int j = 0; j < intArray.length; j++) {
            println("Element at index" + j + ": " + intArray[j]);
        }

        String[] fruits = {"apple", "banana", "cherry", "date"};
        println("");
        for(String fruit : fruits) {
            println(fruit);
        }

        double[] prices = {9.99, 15.50, 7.25};
        println("");
        for (double price : prices) {
            println(price);
        }

        // 2D Array
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Theik", "Chan"}
        };
        println(names[0][0]);

        int[] values = {12, 8, 15, 3, 9, 21};
        int sum = 0;
        int max = values[0];
        int min = values[0];

        for (int value : values) {
            sum += value;
            if (value > max) max = value;
            if (value < min) min = value;
        }

        double average = (double) sum / values.length;

        println("Array: " + Arrays.toString(values));

        // Array copy testing 
        int[] source = { 10, 20, 30, 40, 50};
        int[] destination = new int[3];

        // copy data from source array start at index 1(e.g 20) for length 3 to destination array insert at index 0
        System.arraycopy(source, 1, destination, 0, 3);

        int[] newDestination = Arrays.copyOfRange(source, 2, 4);
        for (int dest: newDestination) {
            print(dest + " ");
        }

        // binarySearch, equals, fill, sort, parallelSort, stream
        Arrays.stream(newDestination).map(dest -> dest + 2).forEach(IO::print);

        println(Arrays.toString(newDestination));

        // var type identifier
        var list = List.of("one", "two", "three", "four");
        for(var count: list) {
            println(count);
        }

        int numResult = +1;
        println(numResult);

        var checkResult = numResult == 1 ? 1 : 0;

        println(checkResult);

        var obj1 = new Parent();
        var obj2 = new Child();

        if (obj1 instanceof Parent) {
        }

        if (obj2 instanceof Child) {
        }

        int bitmask = 0x000F;
        int val = 0x2222;
        println( val & bitmask);

        // count p in string
        var searchMe = "peter piper picked a" + "peak of pickled peppers";
        int maxSize = searchMe.length();
        int numPs = 0;

        for (int index = 0; i< maxSize; i++) {
            if (searchMe.charAt(index) != 'p')
                continue;

            if (index == 5) return;

            numPs++;
        }

        println("found" + numPs + " p's in the string.");


        Day d = Day.FRIDAY;
        int len = switch(d) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        };
        println("len = " + len);

        
    }
}

// public interface MyInterface {}
class Parent { }
class Child extends Parent { }//implements MyInterface { }
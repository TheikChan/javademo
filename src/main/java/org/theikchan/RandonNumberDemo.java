
package org.theikchan;

public class RandonNumberDemo {
    public static void main(String[] args) {

        // Math.random return 0.0 to 0.9 
        int number = (int)(Math.random() * 10); 
        IO.println(number);
    }
}
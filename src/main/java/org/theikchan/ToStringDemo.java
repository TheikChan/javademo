package org.theikchan;

public class ToStringDemo {
    
    public static void main(String[] args) {
        double d = 858.48;
        String s = Double.toString(d);
        
        int dot = s.indexOf('.');
        
        IO.println(dot + " digits " +
            "before decimal point.");
        IO.println( (s.length() - dot - 1) +
            " digits after decimal point.");
    }
}

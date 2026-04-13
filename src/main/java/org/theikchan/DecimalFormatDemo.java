package org.theikchan;

import java.text.DecimalFormat;

public class DecimalFormatDemo {

    static public void customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        IO.println(value + " " + pattern + " " + output);
    }

    public static void main(String[] args) {
        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("00000.000", 123.78);
        customFormat("$###,###.###", 12345.67);
    }
}

package org.theikchan;

public class CharacterDemo {
    public static void main(String[] args) {
        char ch = 'a'; 
        // Unicode for uppercase Greek omega character
        char uniChar = '\u03A9';
        // an array of chars
        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

        // Character class is immutable and have static function like e.g isDigit, isLetter, toUpperCase, ...
        Character ch = new Character('a');

        IO.println("She said \"Hello!\" to me.");
    }
}

package org.theikchan;

public class StringDemo {
    public static void main(String[] args) {
        // String literal
        // String greeting = "Hello world!";
        // IO.println("Greeting: " + greeting);

        // From character array
        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        IO.println("From array: " + helloString);

        // Try creating your own string!
        String myString = "Your message here";
        IO.println("My string: " + myString);

        // reverse palindrome demo
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();

        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // palindrome.getChars(0, len, tempCharArray, 0);
        // put original string in an array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);
        }

        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }

        String reversePalindrome = new String(charArray);
        IO.println(reversePalindrome);

        var name = "My name is ".concat("Rumplestiltskin");
        IO.println(name);

        // Using + operator
        String firstName = "Java";
        String lastName = "Developer";
        String fullName = firstName + " " + lastName;
        IO.println("Full name: " + fullName);

        // Using concat() method
        String greeting = "Hello, ".concat(fullName).concat("!");
        IO.println(greeting);

        // Mixing different types
        int age = 25;
        String info = "I am " + age + " years old";
        IO.println(info);

        // multiline string
        String html = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;


        // String format
        var floatVar = 0.1f;
        var intVar = 12;
        var stringVar = "TC";    

        String fs;
        fs = String.format("The value of the float " +
                        "variable is %f, while " +
                        "the value of the " + 
                        "integer variable is %d, " +
                        " and the string is %s",
                        floatVar, intVar, stringVar);
        IO.println(fs);

        var result = String.valueOf(intVar);
        var result2 = Integer.toString(intVar);

        fs.substring(2, 10);

        String anotherPalindrome = "Niagara. O roar again!"; 
        String roar = anotherPalindrome.substring(11, 15);

        String sentence = "Java programming is fun!";

        // String length
        IO.println("Length: " + sentence.length());

        // Get character at specific position
        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length() - 1);
        IO.println("First char: " + firstChar);
        IO.println("Last char: " + lastChar);

        // Extract substrings
        String word1 = sentence.substring(0, 4);  // "Java"
        String word2 = sentence.substring(5, 16); // "programming"
        String fromIndex = sentence.substring(17); // "is fun!"

        IO.println("Word 1: " + word1);
        IO.println("Word 2: " + word2);
        IO.println("From index 17: " + fromIndex);

        // Try extracting different parts!

        // creates empty builder, capacity 16
        StringBuilder sb = new StringBuilder();
        // adds 9 character string at beginning
        sb.append("Greetings"); // insert will add at the start
    }
}

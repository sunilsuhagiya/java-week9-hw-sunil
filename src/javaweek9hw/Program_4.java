package javaweek9hw;

import java.util.ArrayList;

// Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.
public class Program_4 {
    // Declaring Main method
    public static void main(String[] args) {
        Program_4 obj = new Program_4(); // Creating object to call instance method
        obj.collectionOfColours();
    }

    // Declaring instance method
    public void collectionOfColours() {
        ArrayList<String> colours = new ArrayList(); // ArrayList type String variable is Colours
        colours.add("RED"); // Adding String Values
        colours.add("YELLOW");
        colours.add("GREEN");
        colours.add("BLACK");
        colours.add("BROWN");
        colours.add("PINK");

        for (String colourName : colours) { // Implementing each loop concept & declaring new String variable.
            System.out.println(colourName); // Console will display List of Array Values.
        }
    }
}

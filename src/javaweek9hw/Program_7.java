package javaweek9hw;

import java.util.ArrayList;
import java.util.Arrays;

// Write a Java program to test an array list is empty or not. Define array list with underground tube names
public class Program_7 {
    public static void main(String[] args) {
    Program_7 obj = new Program_7(); // Creation of object to call instance method
    obj.arrayListIsEmptyOrNot();
    }
    // Instance method
    public void arrayListIsEmptyOrNot(){
        ArrayList <String> tubeList = new ArrayList(); // Array List String type variable tubeList
        tubeList.add("Bakerloo"); // Storing values
        tubeList.add("Central");
        tubeList.add("Circle");
        tubeList.add("District");
        tubeList.add("Hammersmith & City");
        tubeList.add("Jubilee");
        tubeList.add("Metropolitan");
        tubeList.add("Northern");
        tubeList.add("Piccadilly");
        tubeList.add("Victoria");
        tubeList.add("Waterloo & City ");

        System.out.println("Original Tube List: " + tubeList); // Print all station name
        System.out.println("The above Tube list is Empty " + " = " + tubeList.isEmpty()); // false
        tubeList.removeAll(tubeList); // Removing all array list values.
        System.out.println("Array List after removing all elements :  " + tubeList); // list is Zero
        System.out.println("The above array list is empty " + " = " + tubeList.isEmpty()); // condition true

    }
}

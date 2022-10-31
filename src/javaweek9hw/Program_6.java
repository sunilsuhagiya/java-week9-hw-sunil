package javaweek9hw;

import java.util.ArrayList;

// Write a Java program to retrieve an element (at a specified index) from a given array list.
public class Program_6 {
    public static void main(String[] args) {
        Program_6 obj = new Program_6();
        obj.retrieveElement();
    }

    public void retrieveElement() {
        // ArrayList
        ArrayList<Integer> list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        // Print all the values of Array list
        System.out.println(list.size());
        // Retrieve element of index 4
        Integer element = list.get(4);
        System.out.println("The Element at index 4 is:  " + element);
        // Retrieve element of index 1
        element = list.get(1); // get method is used for retrieving value of index
        System.out.println("The Element at index 1 is:  " + element);
    }
}

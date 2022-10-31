package javaweek9hw;
//  Write a Java program to reverse an array of integer values.
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Program_3 {
    public static void main(String[] args) {
        Integer x [] = {100, 200, 300, 400, 500}; // Array Declaration
        Program_3 obj = new Program_3(); // Object declaration for calling Instance method
        obj.reverseAnArrayIntegerValues(x); // Method name and variable used for array
    }
    // Instance Method
public void reverseAnArrayIntegerValues(Integer a[]){ // parameterized method and declaring data type and variable
    Collections.reverse(Arrays.asList(a)); // use of collection to get all the values of array x.
    System.out.println(Arrays.asList(a)); // It will give the result as {500,200....100}

}
}

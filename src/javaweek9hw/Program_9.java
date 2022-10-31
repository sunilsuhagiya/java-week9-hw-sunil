package javaweek9hw;

import java.util.HashMap;

//  Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.
public class Program_9 {
    public static void main(String[] args) {
    Program_9 obj = new Program_9(); // Creating object to call instance method
    obj.hashMapStoreKeysAndValues();
    }
    // Instance method
    public void hashMapStoreKeysAndValues(){
        HashMap <String, Integer> testingTech = new HashMap(); //Creating HAshMAp Object
        testingTech.put("BVA" , 1);// Storing values to data types
        testingTech.put("ECP" , 2);
        testingTech.put("Error Guessing" , 3);
        // Using each loop to print all values
        for (String i : testingTech.keySet()){
            System.out.println("Keys: " + i + " , " + " Values " + testingTech.get(i));
        }
    }
}

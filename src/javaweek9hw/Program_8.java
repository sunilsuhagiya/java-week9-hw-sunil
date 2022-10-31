package javaweek9hw;

import java.util.HashSet;

/* Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)
*/
public class Program_8 {
    public static void main(String[] args) {
    Program_8 obj = new Program_8(); // Creating object to call instance method
    obj.hashSetStoreIntegerAndNumber();
    }
    // Instance method
    public void hashSetStoreIntegerAndNumber(){
        HashSet <Integer> numbers = new HashSet<>(); // Creating hashset object called numbers
        numbers.add(4); // Adding values to set
        numbers.add(7);
        numbers.add(8);
        // By using for loop will check which numbers are in set
        for (int i = 1; i <= 10; i++){
            if (numbers.contains(i)){
                System.out.println(i + " is in the Hashset");
            }else {
                System.out.println( i + " is not in the Hashset");
            }
        }
    }
}

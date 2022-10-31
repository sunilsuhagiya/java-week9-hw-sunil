package javaweek9hw;

import java.util.ArrayList;
import java.util.Iterator;

// Write a Java program to iterate through all elements in an array list using
//Iterator
public class Program_5 {
    // Declaring main method
    public static void main(String[] args) {
        Program_5 obj = new Program_5(); // Object creation to call instance method
        obj.iterate();
    }

    // Instance method
    public void iterate() {
        ArrayList<String> cityName = new ArrayList<>();
        cityName.add("Canberra");
        cityName.add("Sydney");
        cityName.add("Melbourne");
        cityName.add("Brisbane");
        cityName.add("Perth");
        cityName.add("Adelaide");
        cityName.add("Tasmania");
        // Creating instance of city name Iterator
        Iterator<String> city = cityName.iterator();
        Iterator itr = cityName.listIterator();
        System.out.println("Iterating ArrayList: ");
        while (city.hasNext())
        {
            System.out.println(city.next());
        }
    }
}

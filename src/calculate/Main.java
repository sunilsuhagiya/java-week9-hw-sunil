package calculate;

import java.util.Scanner;

/* Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N programme should terminate) */
public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        char symbol;
        String again;
        boolean yorn = true;
        // Scanner declaration to read input from console
        Scanner scan = new Scanner(System.in);
        while (yorn) {
            System.out.println("Please Enter First Number: ");
            a = scan.nextInt();
            System.out.println("Please Enter Second Number: ");
            b = scan.nextInt();
            System.out.println("Please Enter One Symbol From +, -, *,  /  :  ");
            symbol = scan.next().charAt(0);
            // object creation
            Calculator obj = new Calculator();
            obj.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation please enter 'Y' or 'N' :  ");
            again = scan.nextLine(); // Storing user input Y
            again = scan.nextLine(); // storing user input N
            if (again.equalsIgnoreCase("Y")) {
                yorn = true;
            }
            if (again.equalsIgnoreCase("N")) {
                //yorn = false;
                System.out.println("Thank you for using My calculator");
                System.exit(0);
            }
        }
    }
}

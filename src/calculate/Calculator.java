package calculate;
/* Create four methods with manes “addition”, “subtraction”, “division”, and “multiplication”.
All methods are instance method and it doesn’t return anything. But it has two parameters with
name “int a” and “int b”. Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with three parameter with name int a, int b
and char symbol. Write the logic in calculateResult method that when user enter first number and
second number and symbol based on symbol it does calculate.
*/
public class Calculator {
    // Instance method No return type
    public void addition(int a, int b){
        System.out.println(a+b);
    }
    public void subtraction(int a, int b) {
        System.out.println(a-b);
    }
    public void division(int a, int b) {
        System.out.println(a/b);
    }
    public void multiplication(int a, int b) {
        System.out.println(a*b);
    }
    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+'){
            System.out.println(a + " + " + b + " = " + (a+b));
        } else if (symbol == '-') {
            System.out.println(a + " - " + b + " = " + (a-b));
        } else if (symbol == '/') {
            System.out.println(a + " / " + b + " = " + (a/b));
        } else if (symbol == '*') {
            System.out.println(a + " * " + b + " = " + (a*b));
        }else
        System.out.println(" You have entered incorrect operator");
    }

}

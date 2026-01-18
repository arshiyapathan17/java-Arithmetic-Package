import mycalculator.Calculator;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + c.add(a, b));
        System.out.println("Subtraction: " + c.subtract(a, b));
        System.out.println("Multiplication: " + c.multiply(a, b));
        System.out.println("Division: " + c.divide(a, b));
        System.out.println("Modulus: " + c.mod(a, b));
    }
}

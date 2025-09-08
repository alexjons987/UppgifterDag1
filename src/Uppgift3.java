import java.util.Scanner;

public class Uppgift3 {
    public static void main(String[] args) {
        System.out.println("\n-Assignment 3: Simple calculator-");

        Scanner scanner = new Scanner(System.in);

        System.out.print("X = ");
        double x = scanner.nextDouble();
        System.out.print("Y = ");
        double y = scanner.nextDouble();

        boolean invalidOperation = true;
        while (invalidOperation) {
            System.out.print("Operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.printf("%.2f + %.2f = %.2f", x, y, (x + y));
                    invalidOperation = false;
                    break;
                case '-':
                    System.out.printf("%.2f - %.2f = %.2f", x, y, (x - y));
                    invalidOperation = false;
                    break;
                case '*':
                    System.out.printf("%.2f * %.2f = %.2f", x, y, (x * y));
                    invalidOperation = false;
                    break;
                case '/':
                    if (y == 0)
                        System.out.println("Cannot divide by zero!");
                    else
                        System.out.printf("%.2f / %.2f = %.2f", x, y, (x / y));
                    invalidOperation = false;
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
    }
}

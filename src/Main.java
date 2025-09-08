import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n1. Age categories");
            System.out.println("2. Score to grade converter");
            System.out.println("3. Simple calculator");
            System.out.println("4. Temperature converter");
            System.out.println("5. Banking simulator");
            System.out.print("Choose assignment 1-5 (0 = exit): ");
            int chosenAssignment = scanner.nextInt();

            switch (chosenAssignment) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    assignment1();
                    break;
                case 2:
                    assignment2();
                    break;
                case 3:
                    assignment3();
                    break;
                case 4:
                    assignment4();
                    break;
                case 5:
                    assignment5();
                    break;
                default:
                    break;
            }
        }
        System.out.println("Bye bye!");
    }

    public static void assignment1() {
        System.out.println("\n-Assignment 1: Age categories-");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Specify age: ");
        int age = scanner.nextInt();

        if (age < 13)
            System.out.println("You belong to the \"Child\" category!");
        else if (age >= 13 && age <= 19)
            System.out.println("You belong to the \"Teen\" category!");
        else if (age >= 20 && age <= 64)
            System.out.println("You belong to the \"Adult\" category!");
        else
            System.out.println("You belong to the \"Senior\" category!");
    }

    public static void assignment2() {
        System.out.println("\n-Assignment 2: Score to grade converter-");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your test score (0-100): ");
        double score = scanner.nextDouble();

        if (score < 0 || score > 100)
            System.out.println("Invalid score");
        else {
            if (score < 60)
                System.out.println("Grade: F");
            else if (score >= 60 && score <= 69)
                System.out.println("Grade: D");
            else if (score >= 70 && score <= 79)
                System.out.println("Grade: C");
            else if (score >= 80 && score <= 89)
                System.out.println("Grade: B");
            else if (score >= 90)
                System.out.println("Grade: A");
        }
    }

    public static void assignment3() {
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

    public static void assignment4() {
        System.out.println("\n-Assignment 4: Temperature converter-");

        Scanner scanner = new Scanner(System.in);
        double c;
        double f;
        System.out.print("Select temperature unit to convert to (\"C\" or \"F\"): ");
        char tempUnit = scanner.next().charAt(0);

        switch (tempUnit) {
            case 'f': // Celsius -> Fahrenheit
            case 'F':
                System.out.print("What is the current temperature (°C): ");
                c = scanner.nextDouble();
                f = c * (9.0f/5.0f) + 32.0f;

                System.out.printf("%.2f °C\n", c);
                System.out.printf("%.2f °F\n", f);
                break;
            case 'c': // Fahrenheit -> Celsius
            case 'C':
                System.out.print("What is the current temperature (°F): ");
                f = scanner.nextDouble();
                c = (f - 32.0f) * 5.0f/9.0f;

                System.out.printf("%.2f °C\n", c);
                System.out.printf("%.2f °F\n", f);
                break;
            default:
                System.out.println("Invalid selection");
                return;
        }

        if (c < 0)
            System.out.println("Very cold - Put on winter clothes!");
        else if (c >= 0 && c <= 10)
            System.out.println("Cold - Jacket is needed!");
        else if (c >= 11 && c <= 20)
            System.out.println("Cool - Simple jacket.");
        else if (c >= 21 && c <= 30)
            System.out.println("Comfortable - T-shirt is enough.");
        else if (c > 30)
            System.out.println("Hot - Shorts and t-shirt!");
    }

    public static void assignment5() {
        System.out.println("\n-Assignment 5: Banking simulator-");


    }
}
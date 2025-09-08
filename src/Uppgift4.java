import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {
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
}

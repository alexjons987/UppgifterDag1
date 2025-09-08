import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args) {
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
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
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
        System.out.println("\n-Assignment 3-");
    }

    public static void assignment4() {
        System.out.println("\n-Assignment 4-");
    }

    public static void assignment5() {
        System.out.println("\n-Assignment 5-");
    }
}
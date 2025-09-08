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
        System.out.println("-Assignment 1-");
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
        System.out.println("-Assignment 2-");
    }

    public static void assignment3() {
        System.out.println("-Assignment 3-");
    }

    public static void assignment4() {
        System.out.println("-Assignment 4-");
    }

    public static void assignment5() {
        System.out.println("-Assignment 5-");
    }
}
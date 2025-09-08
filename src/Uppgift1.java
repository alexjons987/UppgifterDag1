import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {
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
}

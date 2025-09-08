import java.util.Scanner;

public class Uppgift5 {
    public static void main(String[] args) {
        System.out.println("\n-Assignment 5: Banking simulator-");

        Scanner scanner = new Scanner(System.in);
        double balance = 0.0d;
        String currency = " SEK";

        boolean flag = true;
        while (flag) {
            System.out.println("\n\nCurrent balance: " + balance + currency);
            System.out.print("Transaction type (\"withdraw\", \"deposit\" or \"exit\"): ");
            String transactionType = scanner.nextLine();

            switch (transactionType) {
                case "withdraw":
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // Process trailing newline from nextDouble()

                    if (withdrawAmount > balance) {
                        System.out.printf("Error! %f%s is more than your balance of %f%s!", withdrawAmount, currency, balance, currency);
                    } else if (!isPositive(withdrawAmount)) {
                        System.out.println("Error! Unable to withdraw negative values!");
                    } else {
                        balance -= withdrawAmount;
                    }
                    break;
                case "deposit":
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Process trailing newline from nextDouble()

                    if (!isPositive(depositAmount)) {
                        System.out.println("Error! Unable to deposit negative values!");
                    } else {
                        balance += depositAmount;
                    }
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid transaction type: " + transactionType);
                    break;
            }
        }
        System.out.println("Bye bye bank!");
    }

    public static boolean isPositive(double num)
    {
        return num > 0;
    }
}

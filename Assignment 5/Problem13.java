// Write a program to define a class Problem13 containing code and price. Accept this data
// for five objects using array of objects. Display code, price in tabular form and also,
// display total price of all Problem13s.

import java.util.Scanner;

public class Problem13 {
    private String code;
    private double price;

    // Constructor
    public Problem13(String code, double price) {
        this.code = code;
        this.price = price;
    }

    // Getter method for code
    public String getCode() {
        return code;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        // Create an array to store five Problem13 objects
        Problem13[] Problem13s = new Problem13[5];

        // Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Accept data for five Problem13s
        System.out.println("Enter details for five Problem13s:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter code for Problem13 " + (i + 1) + ": ");
            String code = scanner.next();
            System.out.print("Enter price for Problem13 " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            Problem13s[i] = new Problem13(code, price);
        }

        // Close scanner
        scanner.close();

        // Display Problem13s in tabular form
        System.out.println("\nCode\tPrice");
        System.out.println("---------------");
        double totalPrice = 0;
        for (Problem13 Problem13 : Problem13s) {
            System.out.println(Problem13.getCode() + "\t" + Problem13.getPrice());
            totalPrice += Problem13.getPrice();
        }

        // Display total price of all Problem13s
        System.out.println("\nTotal Price of all Problem13s: " + totalPrice);
    }
}

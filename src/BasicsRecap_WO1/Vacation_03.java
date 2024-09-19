package BasicsRecap_WO1;

import java.util.Scanner;

public class Vacation_03 {
    // Method to calculate the total price based on group type, day, and number of people
    public static double calculatePrice(String groupType, String day, int peopleCount) {
        double pricePerPerson = 0.0;

        // Determine the price per person based on group type and day using if-else statements
        if (groupType.equals("Students")) {
            if (day.equals("Friday")) {
                pricePerPerson = 8.45;
            } else if (day.equals("Saturday")) {
                pricePerPerson = 9.80;
            } else if (day.equals("Sunday")) {
                pricePerPerson = 10.46;
            }
        } else if (groupType.equals("Business")) {
            if (day.equals("Friday")) {
                pricePerPerson = 10.90;
            } else if (day.equals("Saturday")) {
                pricePerPerson = 15.60;
            } else if (day.equals("Sunday")) {
                pricePerPerson = 16.00;
            }
        } else if (groupType.equals("Regular")) {
            if (day.equals("Friday")) {
                pricePerPerson = 15.00;
            } else if (day.equals("Saturday")) {
                pricePerPerson = 20.00;
            } else if (day.equals("Sunday")) {
                pricePerPerson = 22.50;
            }
        }

        // Calculate the total price without any discounts
        double totalPrice = pricePerPerson * peopleCount;

        // Apply discounts based on group type and number of people
        if (groupType.equals("Students") && peopleCount >= 30) {
            totalPrice *= 0.85; // 15% discount for students
        } else if (groupType.equals("Business") && peopleCount >= 100) {
            totalPrice -= pricePerPerson * 10; // 10 people stay for free
        } else if (groupType.equals("Regular") && peopleCount >= 10 && peopleCount <= 20) {
            totalPrice *= 0.95; // 5% discount for regular groups
        }

        // Return the total price
        return totalPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Directly read inputs
        int peopleCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        // Calculate and print the total price
        double totalPrice = calculatePrice(groupType, day, peopleCount);
        System.out.printf("Total price: %.2f%n", totalPrice);

        scanner.close();
    }
}


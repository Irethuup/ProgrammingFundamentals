package RegularMidExam_26_10_24;

import java.util.Scanner;

public class SpringVacation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysAmount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int amountOfPeople = Integer.parseInt(scanner.nextLine());
        double fuelPerKilometerPrice = Double.parseDouble(scanner.nextLine());
        double foodExpensesPerPersonForADay = Double.parseDouble(scanner.nextLine());
        double roomsPricePerPersonForANight = Double.parseDouble(scanner.nextLine());

        //as output -> print the result formatted 2 digits after the decimal separator
        //izchisleniq predi putuvaneto

        // Initial food and accommodation expenses
        double totalFoodCost = foodExpensesPerPersonForADay * amountOfPeople * daysAmount;
        double totalRoomCost = roomsPricePerPersonForANight * amountOfPeople * daysAmount;

        // Apply discount if more than 10 people
        if (amountOfPeople > 10) {
            totalRoomCost *= 0.75;
        }

        //initial expenses (food and accommodation)
        double currentExpenses = totalFoodCost + totalRoomCost;

        for (int day = 1; day <= daysAmount; day++) {
            double traveledDistance = Double.parseDouble(scanner.nextLine());
            double fuelCostForTheDay = traveledDistance * fuelPerKilometerPrice;
            currentExpenses += fuelCostForTheDay;

            //expenses on every third and fifth day-40% of current expenses
            if (day % 3 == 0 || day % 5 == 0) {
                currentExpenses += currentExpenses * 0.40;
            }

            // reduce expenses
            if (day % 7 == 0) {
                currentExpenses -= currentExpenses / amountOfPeople;
            }

            // Check if the current expenses exceed the budget
            if (currentExpenses > budget) {
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.%n", currentExpenses - budget);
                return; // End the program early if budget is exceeded
            }
        }

        //check after the loop
        System.out.printf("You have reached the destination. You have %.2f$ budget left.%n", budget - currentExpenses);
    }
}

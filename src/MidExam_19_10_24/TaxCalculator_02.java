package MidExam_19_10_24;

import java.util.Scanner;

public class TaxCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vehicles = scanner.nextLine();
        String[] vehicleArray = vehicles.split(">>");
        double totalTaxCollected = 0;

        for (String vehicle : vehicleArray) {
            String[] vehicleDetails = vehicle.trim().split(" ");
            if (vehicleDetails.length != 3) {
                System.out.println("Invalid input format.");
                continue;
            }

            String type = vehicleDetails[0];
            int years;
            int km;

            try {
                years = Integer.parseInt(vehicleDetails[1]);
                km = Integer.parseInt(vehicleDetails[2]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format.");
                continue;
            }

            // Таксата
            double tax = calculateTax(type, years, km);
            if (tax != -1) {
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", type, tax);
                totalTaxCollected += tax;
            } else {
                System.out.println("Invalid car type.");
            }
        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.%n", totalTaxCollected);
        scanner.close();
    }

    // Правим метод за да изчислим таксата
    public static double calculateTax(String type, int years, int km) {
        double tax = 0;
        switch (type) {
            case "family":
                //for a family car, the tax declines by 5 euros for every year in use. Also, the tax increases by 12 euros for every 3000km. traveled.
                tax = 50 - (years * 5) + Math.floor(km / 3000) * 12;
                break;
            case "heavyDuty":
                //for a heavtDuty car, the tax declines by 8 euros for every year in use. Also, the tax increases by 14 euros for every 3000km. traveled.
                tax = 80 - (years * 8) + Math.floor(km / 9000) * 14;
                break;
            case "sports":
               // for a sports car, the tax declines by 9 euros for every year in use. Also, the tax increases by 18 euros for every 3000km. traveled.
                tax = 100 - (years * 9) + Math.floor(km / 2000) * 18;
                break;
            case "van":
            case "pickup":
                return -1;
            default:
                return -1;
        }
        return Math.max(tax, 0);
    }
}

package ObjectsAndClassesExercises_WO5.VehicleCatalogue_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class VehicleCatalogue {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Vehicle> vehicles = new ArrayList<>();

            String command;
            while (!(command = scanner.nextLine()).equals("End")) {
                String[] vehicleData = command.split(" ");
                String type = vehicleData[0];
                String model = vehicleData[1];
                String color = vehicleData[2];
                int horsepower = Integer.parseInt(vehicleData[3]);

                vehicles.add(new Vehicle(type, model, color, horsepower));
            }

            double carHorsepowerSum = 0;
            int carCount = 0;
            double truckHorsepowerSum = 0;
            int truckCount = 0;

            for (Vehicle vehicle : vehicles) {
                if (vehicle.type.equals("car")) {
                    carHorsepowerSum += vehicle.horsepower;
                    carCount++;
                } else if (vehicle.type.equals("truck")) {
                    truckHorsepowerSum += vehicle.horsepower;
                    truckCount++;
                }
            }

            if (carCount > 0) {
                System.out.println("Cars have average horsepower of: " + (carHorsepowerSum / carCount));
            } else {
                System.out.println("Cars have average horsepower of: 0.00");
            }

            if (truckCount > 0) {
                System.out.println("Trucks have average horsepower of: " + (truckHorsepowerSum / truckCount));
            } else {
                System.out.println("Trucks have average horsepower of: 0.00");
            }
        }
    }

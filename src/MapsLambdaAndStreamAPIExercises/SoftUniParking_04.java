package MapsLambdaAndStreamAPIExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            String username = tokens[1];

            if (command.equals("register")) {
                String licensePlate = tokens[2];
                if (parking.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", parking.get(username));
                } else {
                    parking.put(username, licensePlate);
                    System.out.printf("%s registered %s successfully%n", username, licensePlate);
                }
            } else if (command.equals("unregister")) {
                if (!parking.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    parking.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }

        parking.forEach((user, plate) -> System.out.printf("%s => %s%n", user, plate));
    }
}

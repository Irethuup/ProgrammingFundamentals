package AddociativeArraysExercises_WO6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftuniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parkingData = new LinkedHashMap<>();

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int count = 0; count < numberOfCommands; count++) {
            String command = scanner.nextLine();
            //1.command = "register {username} {LicensePlateNumber}"
            //2. command = "unregister {username}"
            String [] commandParts = command.split(" ");
            //commandParts = ["register", "{username}", "{LicensePlateNumber}"
            //commandParts = ["unregister", "{username}"]
            String commandType = commandParts[0]; //"register" or "unregister"
            String username = commandParts[1]; //name of the owner

            if(commandType.equals("register")) {
                String carNumber = commandParts[2]; //nomera na kolata
                //1. we have such owner at the parking
                if (!parkingData.containsKey(username)) {
                    System.out.println("ERROR: already registered with plate number" + parkingData.get(username));
                } else {
                    parkingData.put(username, carNumber);
                    System.out.printf("%s registered %s successfully%n", username, carNumber);
                }
                //2. we don't have such owner at the parking
            } else if (commandType.equals("unregister")) {
                if (parkingData.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    parkingData.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }

        }
        //parkingData: owner -> car number
        //entry -> suhranqvame vseki edin zapis
        //entry.getKey() -> owner
        //entry.getValue() -> car number
        parkingData.entrySet().forEach(entry -> System.out.println(entry.getKey() + entry.getValue()));
    }
}

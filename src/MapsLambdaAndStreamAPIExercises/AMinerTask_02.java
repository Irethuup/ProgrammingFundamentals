package MapsLambdaAndStreamAPIExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resources = new LinkedHashMap<>();

        while (true) {
            String resource = scanner.nextLine();
            if (resource.equals("stop")) break;
            int quantity = Integer.parseInt(scanner.nextLine());
            resources.put(resource, resources.getOrDefault(resource, 0) + quantity);
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

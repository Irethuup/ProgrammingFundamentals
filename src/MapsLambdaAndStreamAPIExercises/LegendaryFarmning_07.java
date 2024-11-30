package MapsLambdaAndStreamAPIExercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarmning_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new TreeMap<>();
        Map<String, Integer> junkMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        boolean obtained = false;
        while (!obtained) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        String legendary = switch (material) {
                            case "shards" -> "Shadowmourne";
                            case "fragments" -> "Valanyr";
                            default -> "Dragonwrath";
                        };
                        System.out.println(legendary + " obtained!");
                        obtained = true;
                        break;
                    }
                } else {
                    junkMaterials.put(material, junkMaterials.getOrDefault(material, 0) + quantity);
                }
            }
        }

        keyMaterials.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junkMaterials.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}


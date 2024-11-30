package MapsLambdaAndStreamAPIExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, double[]> products = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("buy")) break;

            String[] tokens = input.split(" ");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            products.putIfAbsent(name, new double[] {price, 0});
            products.get(name)[0] = price; // Update price
            products.get(name)[1] += quantity; // Accumulate quantity
        }

        for (Map.Entry<String, double[]> entry : products.entrySet()) {
            String product = entry.getKey();
            double total = entry.getValue()[0] * entry.getValue()[1];
            System.out.printf("%s -> %.2f%n", product, total);
        }
    }
}

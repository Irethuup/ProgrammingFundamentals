package MidExam_19_10_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GroceryShopping_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //grocery list
        String initialProducts = scanner.nextLine();
        List<String> commands = new ArrayList<>();

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Shop!")) {
                commands.add(command);
                break;
            }
            commands.add(command);
        }

        groceryShopping(initialProducts, commands);
        scanner.close();
    }

    public static void groceryShopping(String initialProducts, List<String> commands) {
        List<String> products = new ArrayList<>(Arrays.asList(initialProducts.split("\\|")));

        for (String request : commands) {
            if (request.equals("Shop!")) {
                break;
            }

            String[] parts = request.split("%");
            String command = parts[0];

            switch (command) {
                case "Important":
                    String importantProduct = parts[1];
                    if (products.contains(importantProduct)) {
                        products.remove(importantProduct);
                    }
                    products.add(0, importantProduct);
                    break;

                case "Add":
                    String addProduct = parts[1];
                    if (products.contains(addProduct)) {
                        System.out.println("The product is already in the list.");
                    } else {
                        products.add(addProduct);
                    }
                    break;

                case "Swap":
                    String product1 = parts[1];
                    String product2 = parts[2];
                    if (products.contains(product1) && products.contains(product2)) {
                        int index1 = products.indexOf(product1);
                        int index2 = products.indexOf(product2);
                        Collections.swap(products, index1, index2);
                    } else {
                        String missingProduct = products.contains(product1) ? product2 : product1;
                        System.out.println("Product " + missingProduct + " missing!");
                    }
                    break;

                case "Remove":
                    String removeProduct = parts[1];
                    if (products.contains(removeProduct)) {
                        products.remove(removeProduct);
                    } else {
                        System.out.println("Product " + removeProduct + " isn't in the list.");
                    }
                    break;

                case "Reversed":
                    Collections.reverse(products);
                    break;

                default:
                    break;
            }
        }
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
    }
}

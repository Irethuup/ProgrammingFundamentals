package RegularMidExam_26_10_24;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GeneratingNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //list of integers
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (scanner.hasNextLine()) {
            String request = scanner.nextLine();
            if (request.equals("END")) {
                break;
            }

            String[] components = request.split(" ");
            String command = components[0];

            switch (command) {
                case "add":
                    if (components[1].equals("to") && components[2].equals("start")) {
                        addToStart(numbers, Arrays.copyOfRange(components, 3, components.length));
                    }
                    break;
                case "remove":
                    if (components[1].equals("greater") && components[2].equals("than")) {
                        try {
                            int value = Integer.parseInt(components[3]);
                            removeGreaterThan(numbers, value);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number format in 'remove greater than' command.");
                        }
                    } else if (components[1].equals("at")) {
                        try {
                            int index = Integer.parseInt(components[2]);
                            removeAtIndex(numbers, index);
                        } catch (NumberFormatException e) {
                           // System.out.println("Error: Invalid number format in 'remove at index' command.");
                        }
                    }
                    break;
                case "replace":
                    try {
                        int value = Integer.parseInt(components[1]);
                        int replacement = Integer.parseInt(components[2]);
                        replaceValue(numbers, value, replacement);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number format in 'replace' command.");
                    }
                    break;
                case "find":
                    if (components[1].equals("even")) {
                        findEven(numbers);
                    } else if (components[1].equals("odd")) {
                        findOdd(numbers);
                    }
                    break;
                default:
                    System.out.println("Unrecognized command.");
            }
        }
        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));
    }

    private static void addToStart(List<Integer> numbers, String[] elements) {
        for (int i = elements.length - 1; i >= 0; i--) {
            try {
                numbers.add(0, Integer.parseInt(elements[i]));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format for addToStart elements.");
            }
        }
    }

    private static void removeGreaterThan(List<Integer> numbers, int value) {
        numbers.removeIf(num -> num > value);
    }

    private static void replaceValue(List<Integer> numbers, int value, int replacement) {
        int index = numbers.indexOf(value);
        if (index != -1) {
            numbers.set(index, replacement);
        }
    }

    private static void removeAtIndex(List<Integer> numbers, int index) {
        if (index >= 0 && index < numbers.size()) {
            numbers.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void findEven(List<Integer> numbers) {
        System.out.println(numbers.stream().filter(num -> num % 2 == 0)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }

    private static void findOdd(List<Integer> numbers) {
        System.out.println(numbers.stream().filter(num -> num % 2 != 0)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
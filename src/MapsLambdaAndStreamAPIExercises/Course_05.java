package MapsLambdaAndStreamAPIExercises;

import java.util.*;

public class Course_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) break;

            String[] tokens = input.split(" : ");
            String course = tokens[0];
            String student = tokens[1];

            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(student);
        }

        courses.entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(student -> System.out.printf("-- %s%n", student));
                });
    }
}

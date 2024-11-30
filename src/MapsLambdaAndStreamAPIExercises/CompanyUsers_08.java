package MapsLambdaAndStreamAPIExercises;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> companies = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) break;

            String[] tokens = input.split(" -> ");
            String company = tokens[0];
            String employeeId = tokens[1];

            companies.putIfAbsent(company, new LinkedHashSet<>());
            companies.get(company).add(employeeId);
        }

        companies.forEach((company, employees) -> {
            System.out.println(company);
            employees.forEach(employee -> System.out.println("-- " + employee));
        });
    }
}

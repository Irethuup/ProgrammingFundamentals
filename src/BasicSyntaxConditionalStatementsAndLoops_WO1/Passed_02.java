package BasicSyntaxConditionalStatementsAndLoops_WO1;

import java.util.Scanner;

public class Passed_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double grade = 3.00;

        if (number >= grade) {
            System.out.println("Passed!");
        }
    }
}

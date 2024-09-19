package BasicSyntaxConditionalStatementsAndLoops_WO1;

import java.util.Scanner;

public class PassedOrFailed_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        double number = 3.00;

        if (grade >= number) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

    }
}

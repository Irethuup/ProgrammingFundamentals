package BasicsRecap_WO1;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number; // Store the original number

        int sumFactorial = 0;
        while (number > 0) {
            // 1. взимаме последната цифра
            int lastDigit = number % 10; // Corrected to use % for the last digit
            // 2. изчисляваме факториела на последната цифра
            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) { // Corrected to use lastDigit
                factorial = factorial * i;
            }
            // 3. добавяме изчисления факториел към общата сума
            sumFactorial += factorial;
            // 4. премахваме последната цифра
            number = number / 10; // Corrected to use / for removing the last digit
        }

        if (startNumber == sumFactorial) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
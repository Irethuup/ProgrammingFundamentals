package DataTypesAndVariablesExercise_WO2;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSymbols = Integer.parseInt(scanner.nextLine());
        int sum = 0; //сумата от аски кодовете

        for (int i = 1; i <= countSymbols; i++) {
            char symbol = scanner.nextLine().charAt(0); //въведения символ от конзолата
            int code = (int) symbol; //аски кода на въведения символ
            sum += code;
        }

        //обходили всички символи
        System.out.println("The sum equals: " + sum);
    }
}

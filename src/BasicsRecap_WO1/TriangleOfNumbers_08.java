package BasicsRecap_WO1;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        int n = Integer.parseInt(scanner.nextLine());

        //n == брой редове, които трябва да отпечатваме
        for (int row = 1; row <= n; row++ ) { //obhojda vsichki redove
            //повтаряме: отпечатваме данни
            for (int count = 1; count <= row; count++) { //kolko puti otpechatvam nomera na reda
                System.out.print(row + " ");
            }
            //predi preminavaneto na sledvashtiq red -> svalqme kursora
            System.out.println();
        }

    }
}

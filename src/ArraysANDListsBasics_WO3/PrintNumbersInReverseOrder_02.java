package ArraysANDListsBasics_WO3;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scann.nextLine());
        int [] n =  new int [countNumbers];

        for (int i = 0; i < n.length; i++) {
            n [i] = Integer.parseInt(scann.nextLine());
        }

        for (int i = n.length - 1; i >= 0; i--) {

            System.out.print(n[i] + " ");
        }
    }
}

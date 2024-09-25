package ArraysANDListsBasics_WO3;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scann.nextLine().split(" ")) // .. 
                .mapToInt(Integer::parseInt) // -> [ 1, 2, 3, 4, 5, 6]
                .toArray();

        int sumOfEvenNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];

            if (currentElement % 2 == 0) {
                sumOfEvenNumbers += currentElement;
            }

        }

        System.out.println(sumOfEvenNumbers);

       /* for (int number : numbers) {
            if (number % 2 == o) {
                sumOfEvenNumbers += number;
            }*/

        }
    }

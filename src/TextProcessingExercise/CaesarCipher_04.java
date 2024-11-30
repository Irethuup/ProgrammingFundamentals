package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (char c : text.toCharArray()) {
            char encryptedSymbol = (char) (c + 3); // Fixed variable name from 'symbol' to 'c'
            encryptedText.append(encryptedSymbol);
        }

        System.out.println(encryptedText.toString()); // Added to print the encrypted text
    }
}

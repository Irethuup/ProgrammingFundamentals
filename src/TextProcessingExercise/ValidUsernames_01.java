package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");
        // ["sh", "too_long_username", "!lleg@l ch@rs", "jeffbutt"]

        for (String username : usernames) {
            //proverka dali e validno -> print
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }

    //metod, koito proverqva dali username e validen
    // vrushta stoinostta true -> ako username-a e validen
    //false -> ako username ne e validen
    public static boolean isValidUsername(String username) {
        // 1. validna duljina
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        // 2. validno sudurjanie _. bukvi, cifri
        for (char ch : username.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '_' && ch != '-') {
                return false;
            }
        }
        return true;
    }
}

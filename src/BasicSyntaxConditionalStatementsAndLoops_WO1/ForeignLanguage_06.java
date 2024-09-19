package BasicSyntaxConditionalStatementsAndLoops_WO1;

import java.util.Scanner;

public class ForeignLanguage_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String language = "";

        switch (country) {
            case "USA", "England" -> language = "English";
            case "Spain", "Argentina", "Mexico" -> language = "Spanish";
            default -> language = "unknown";
        }
        System.out.println(language);
    }
}

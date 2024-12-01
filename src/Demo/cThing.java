package Demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cThing {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        int numberOfEntries = Integer.parseInt(inputScanner.nextLine());
        String patternString = "\\|(?<bossName>[A-Z]{4,})\\|:#(?<bossTitle>[A-Za-z]+ [A-Za-z]+)#";
        Pattern regexPattern = Pattern.compile(patternString);

        for (int entry = 0; entry < numberOfEntries; entry++) {
            String bossEntry = inputScanner.nextLine();
            Matcher entryMatcher = regexPattern.matcher(bossEntry);

            if (entryMatcher.matches()) {
                String bossName = entryMatcher.group("bossName");
                String bossTitle = entryMatcher.group("bossTitle");

                System.out.println(bossName + ", The " + bossTitle);
                System.out.println(">> Strength: " + bossName.length());
                System.out.println(">> Armor: " + bossTitle.length());
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}

package RegularExam_1_12_24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush_02 {
    public static void main(String[] args) {

        Scanner inputScann = new Scanner(System.in);
        int numberOfEntrie = Integer.parseInt(inputScann.nextLine());
        String rege = "\\|(?<boss>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#";
        Pattern regePattern = Pattern.compile(rege);

        for (int i = 0; i < numberOfEntrie; i++) {
            String bossEntry = inputScann.nextLine();
            Matcher entryMatcher = regePattern.matcher(bossEntry);

            if (entryMatcher.find()) {
                String bossName = entryMatcher.group("boss");
                String bossTitle = entryMatcher.group("title");
                System.out.println(bossName + ", The " + bossTitle);
                System.out.println(">> Strength: " + bossName.length());
                System.out.println(">> Armor: " + bossTitle.length());
            } else {
                System.out.println("Access denied!");
            }
        }

    }
}

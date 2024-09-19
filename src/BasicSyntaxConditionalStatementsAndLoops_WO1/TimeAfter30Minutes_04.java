package BasicSyntaxConditionalStatementsAndLoops_WO1;

import java.util.Scanner;

public class TimeAfter30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentHour = Integer.parseInt(scanner.nextLine());
        int currentMinutes = Integer.parseInt(scanner.nextLine());

        // Add 30 minutes to the current time
        int totalMinutesAfter30Minutes = currentHour * 60 + currentMinutes + 30;

        // Find the hour after adding 30 minutes
        int finalHours = totalMinutesAfter30Minutes / 60;
        // Find the minutes after adding 30 minutes
        int finalMinutes = totalMinutesAfter30Minutes % 60;

        // Adjust the hour if it exceeds 23
        if (finalHours > 23) {
            finalHours = 0;
        }
        System.out.printf("%d:%02d", finalHours, finalMinutes);
    }
}

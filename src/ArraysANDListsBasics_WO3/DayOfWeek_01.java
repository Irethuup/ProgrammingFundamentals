package ArraysANDListsBasics_WO3;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int currentDay = Integer.parseInt(scann.nextLine());
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (currentDay >= 1 && currentDay <= 7) {
            System.out.println(weekDays[currentDay - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}

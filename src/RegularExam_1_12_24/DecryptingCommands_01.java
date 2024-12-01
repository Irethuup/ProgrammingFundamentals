package RegularExam_1_12_24;


import java.util.Scanner;

public class DecryptingCommands_01 {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        String message_text = inputScanner.nextLine();

        String command;
        while (!(command = inputScanner.nextLine()).equals("Finish")) {
            String[] parts = command.split(" ");
            switch (parts[0]) {
                case "Replace":
                    message_text = message_text.replace(parts[1], parts[2]);
                    System.out.println(message_text);
                    break;
                case "Cut":
                    int startInd = Integer.parseInt(parts[1]);
                    int endInd = Integer.parseInt(parts[2]);
                    if (isValidIndex(startInd, message_text) && isValidIndex(endInd, message_text)) {
                        message_text = message_text.substring(0, startInd) + message_text.substring(endInd + 1);
                        System.out.println(message_text);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    if (parts[1].equals("Upper")) {
                        message_text = message_text.toUpperCase();
                    } else {
                        message_text = message_text.toLowerCase();
                    }
                    System.out.println(message_text);
                    break;
                case "Check":
                    if (message_text.contains(parts[1])) {
                        System.out.println("Message contains " + parts[1]);
                    } else {
                        System.out.println("Message doesn't contain " + parts[1]);
                    }
                    break;
                case "Sum":
                    startInd = Integer.parseInt(parts[1]);
                    endInd = Integer.parseInt(parts[2]);
                    if (isValidIndex(startInd, message_text) && isValidIndex(endInd, message_text)) {
                        int sum = 0;
                        for (int i = startInd; i <= endInd; i++) {
                            sum += message_text.charAt(i);
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }
        }
    }

    private static boolean isValidIndex(int index, String message) {
        return index >= 0 && index < message.length();

    }
}

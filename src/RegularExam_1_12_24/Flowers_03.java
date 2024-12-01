package RegularExam_1_12_24;

import java.util.*;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner inputScann = new Scanner(System.in);
        String actionInputLine;
        // Map<String, int[]> followersDataMap = new HashMap<>();
        // Map<String, int[]> followersDataMap = new TreeMap<>();
        Map<String, int[]> followersDataMap = new LinkedHashMap<>();

        while (!(actionInputLine = inputScann.nextLine()).equals("Log out")) {
            String[] commandParts = actionInputLine.split(": ");
            String commandType = commandParts[0];
            String username = commandParts[1];

            switch (commandType) {
                case "New follower":
                    followersDataMap.putIfAbsent(username, new int[]{0, 0});
                    break;
                case "Like":
                    int likeCount = Integer.parseInt(commandParts[2]);
                    followersDataMap.putIfAbsent(username, new int[]{0, 0});
                    followersDataMap.get(username)[0] += likeCount;
                    break;
                case "Comment":
                    followersDataMap.putIfAbsent(username, new int[]{0, 0});
                    followersDataMap.get(username)[1]++;
                    break;
                case "Blocked":
                    if (followersDataMap.containsKey(username)) {
                        followersDataMap.remove(username);
                    } else {
                        System.out.println(username + " doesn't exist.");
                    }
                    break;
            }
        }

        System.out.println(followersDataMap.size() + " followers");
        followersDataMap.forEach((user, stats) ->
                System.out.println(user + ": " + (stats[0] + stats[1])));
    }
}

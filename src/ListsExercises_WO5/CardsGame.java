package ListsExercises_WO5;

import java.util.*;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> player1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> player2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.remove(0);
            int card2 = player2.remove(0);

            if (card1 > card2) {
                player1.add(card1);
                player1.add(card2);
            } else if (card2 > card1) {
                player2.add(card2);
                player2.add(card1);
            }
        }

        if (player1.isEmpty()) {
            System.out.println("Second player wins! Sum: " + player2.stream().mapToInt(Integer::intValue).sum());
        } else {
            System.out.println("First player wins! Sum: " + player1.stream().mapToInt(Integer::intValue).sum());
        }
    }
}

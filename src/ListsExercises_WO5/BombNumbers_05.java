package ListsExercises_WO5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] bombData = scanner.nextLine().split(" ");
        int bomb = Integer.parseInt(bombData[0]);
        int power = Integer.parseInt(bombData[1]);

        while (numbers.contains(bomb)) {
            int index = numbers.indexOf(bomb);
            int start = Math.max(0, index - power);
            int end = Math.min(numbers.size() - 1, index + power);

            for (int i = end; i >= start; i--) {
                numbers.remove(i);
            }
        }

        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
    }
}

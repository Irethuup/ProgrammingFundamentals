package ListsExercises_WO5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command;
        while (!(command = scanner.nextLine()).equals("end")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("Delete")) {
                int element = Integer.parseInt(tokens[1]);
                numbers.removeAll(Collections.singletonList(element));
            } else if (tokens[0].equals("Insert")) {
                int element = Integer.parseInt(tokens[1]);
                int position = Integer.parseInt(tokens[2]);
                numbers.add(position, element);
            }
        }

        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}

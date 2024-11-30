package AddociativeArraysExercises_WO6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        //input = "Desislava"
        //input.toCharArray() - > ['D', 'e', 's', 'i', 's', 'l', 'a', 'v', 'a']
        for (char symbol : input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!symbolsCount.containsKey(symbol)) {
                //ne sme sreshtali takuv simvol
                symbolsCount.put(symbol, 1);
            } else {
                //veche ima takuv symbol
                int currentCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentCount + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
            //entry -> vseki edin zapis
            //entry.getKey() -> poluchavame simvola
            //entry.getValue() -> br. sreshtaniq
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

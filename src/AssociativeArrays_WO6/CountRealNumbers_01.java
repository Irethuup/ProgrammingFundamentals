package AssociativeArrays_WO6;

import java.util.*;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> numbersMap = new TreeMap<>();

        for (double num : numbers) {
            if (!numbersMap.containsKey(num)){
                numbersMap.put(num, 1);
            } else {
                /*int occurrences = numbersMap.get(num);//poluchavame stoinosta, koqto stoi sreshtu siotvetniq klyuch
                occurrences++;
                numbersMap.put(num, occurrences);*/

                numbersMap.put(num, numbersMap.get(num) + 1);
            }

        }
        for(Map.Entry<Double, Integer> entry: numbersMap.entrySet()){

            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());

        }
    }
}

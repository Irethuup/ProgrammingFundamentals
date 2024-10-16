package DataTypesAndVariablesExercise_WO2;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine()); //брой на кеговете

        //за всеки един кеф от първия (1) до последния (countKegs):
        //1. модел -> String
        //2. радиус -> double
        //3. височина -> int
        //4. обем на кега = пи * радиус * радиус * височина


        double maxVolume = Double.MIN_VALUE; //максималния (най-големия) обем
        String maxModel = ""; //модела на кега, който е с най-голям обем

        for (int keg = 1; keg <= countKegs; keg++) {
            //въвеждаме данните за кега
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            //изчисляваме обема на въведения кег
            double volume = Math.PI * Math.pow(radius, 2) * height;

            //проверка дали въведения кег е най-голям
            if (volume > maxVolume) {
                //моя кег е най-голям
                maxVolume = volume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);

    }
}

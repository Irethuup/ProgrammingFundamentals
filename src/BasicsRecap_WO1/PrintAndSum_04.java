package BasicsRecap_WO1;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        //2. отпечатваме всички числа в диапазона
        //3. намиране на сумата на числата в диапазона
        //[5; 1-]
        //For цикъл
        //начало: startNumber
        //край: endNumber
        //повтаряме: отпечатваме число + " " /сумираме
        //промяна: +1
        int sum = 0; //сумата на числата
        for (int number = startNumber; number<= endNumber; number++) {
            System.out.print(number + " ");
            sum = sum + number; //sum += number
        }

        //4. отпечатваме сумата
        System.out.println(); //сваля курсора на нов ред
        System.out.println("Sum: " + sum);;

    }
}

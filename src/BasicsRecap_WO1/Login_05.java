package BasicsRecap_WO1;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        String username = scanner.nextLine();

        //2. намираме паролата
        String password = ""; //парола -> "recA"

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position); //символа на текущата позиция
            password += currentSymbol;
        }

        //Потребителски профил
        // потребителско име: username
        //парола: password

        //while цикъл, защото не знаем колко пъти ще се изпълни
        //повтаряме: въвеждане на парола за вход
        //стоп: въведената парола == password
        //продължаваме: въведената парола != password
        int countWrongPasswords = 0; //брой на въведените грешни пароли
        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)) {
            //wrong password щом сме влезли в while цикъла, въведената парола е грешна
            countWrongPasswords++;

            //1. проверка дали сме блокирали профила
            if (countWrongPasswords == 4) {
                //профила е блокиран тъй като сме въвели 4 пъти
                System.out.printf("User %s blocked!", username);
                return; //прекратява цялата програма (докато brake не прекратява цикъла а спира)
            }

            //2. ОПИТАЙ ОТНОВО, ако имаме грешна парола и неблокиран акаунт
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        // Successful login
        System.out.printf("User %s logged in.", username);
    }
}

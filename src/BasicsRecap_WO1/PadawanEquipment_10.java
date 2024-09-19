package BasicsRecap_WO1;

import java.time.temporal.IsoFields;
import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. whodni danni
        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        //2. suma za mechove = broi na mechove * cena za 1 mech
        double sumSabers = Math.ceil(countStudents + 0.10 * countStudents) * priceSaber;

        //3. suma za robi = broi na robi * cena na 1 roba
        double sumRobes = countStudents * priceRobe;

        //4. suma za kolani = broi na kolani * cena za 1 kolan
        double sumBelts = (countStudents - countStudents / 6) * priceBelt; // Corrected to include priceBelt

        //5. namiram obshtata suma, koqto trqbva da platq
        double totalSum = sumSabers + sumRobes + sumBelts; // Corrected to include sumBelts
        //6. proverqvame dali budgeta e dostatuchen

        if (budget >= totalSum) {
            //dostatuchen
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            //budget not enough (budget < totalSum)
            double neededMoney = totalSum - budget;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }

    }
}

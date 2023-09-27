import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Zadej první číslo:");
        double prvniCislo = input.nextDouble();
        System.out.println("Zadej druhé číslo:");
        double druheCislo = input.nextDouble();
        if (prvniCislo > druheCislo) {
            vypis("První číslo bylo větší než to druhé");
        } else if (druheCislo > prvniCislo) {
            vypis("Druhé číslo je větší než to první");
        } else {
            vypis("Obě čísla jsou stejná");
        }
    }

    public static void vypis(String text) {
        System.out.println(text);
    }


}
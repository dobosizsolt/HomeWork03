import java.util.Random;
import java.util.Scanner;

public class Gamev2 {

    public static void playBarchobaWithNumbers() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int max = 50;
        int pcRandomNumber = random.nextInt(max + 1);//Véletlen szám generálás 0 és 50 között.
        int maxTry = 10;//Tippelések száma.
        boolean win = false;

        System.out.println("Barchobázzunk!" +
                "\nGondoltam egy számra 0 és 50 között." +
                "\nTaláld ki melyik számra gondoltam!");

        for (int i = 0; i < maxTry;) {
            System.out.println("Van még " + maxTry + " lehetőséged. Tipp: ");
            int getTry = scanner.nextInt();
            maxTry --;

            if (getTry > pcRandomNumber) {
                System.out.println("Kissebb számra gondoltam!");
            }

            else if (getTry < pcRandomNumber) {
                System.out.println("Nagyobb számra gondoltam!");
            }

            else if (getTry == pcRandomNumber) {
                win = true;
                System.out.println("Eltaláltad! Nyertél!");
                break;
            }
        }
        if (!win) {
            System.out.println("Vesztettél :)");
        }
    }
}

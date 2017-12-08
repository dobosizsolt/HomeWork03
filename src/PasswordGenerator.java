import java.util.Random;

/**Deklaráltam egy int típusú length nevű változót a jelszó
 * hosszának beállítására. Majd 4 final string változót, melyekben
 * a választható karakterek vannak. Létrehoztam egy generatePassword metódust 2 bemeneti paraméterrel.
 * Az első paramétere egy int, a másik egy string.
 * for ciklusban random kiválasztottam egy karaktert a bemenő paraméterben kapott
 * karakterekből, majd visszatérési értékben hozzáadtam a soronkövetkező karaktert.*/

public class PasswordGenerator {

    public static void main(String[] args) {

        int length = 8;
        String password = generatePassword(length, CAPITALS + LETTERS + NUMBERS + SYMBOLS);

        System.out.println(password);
    }

    private static Random random = new Random();

    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String CAPITALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "§<>#&@%!+/=*-";

    public static String generatePassword(int length, String chars) {
        String result = "";
        for (int i = 0; i < length; i++) {
            int getChars = random.nextInt(chars.length());
            result += chars.charAt(getChars);
        }
        return result;
    }


}

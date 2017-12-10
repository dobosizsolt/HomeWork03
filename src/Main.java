
public class Main {

    public static void main(String[] args) {

        System.out.println(PasswordGenerator.generatePassword(8));

       // Game game = new Game();
        //Game.playBarchobaWithNumbers();

        Temperature temperature = new Temperature();
        Temperature.getTemperatureDataFromConsole();

        System.out.println(Temperature.printHighestTemperature());
        System.out.println(Temperature.printLowestTemperature());

    }
}

import java.util.Scanner;

public class Temperature {


    public static float [] temperatures = new float[10];

    public static void getTemperatureDataFromConsole() {


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < temperatures.length ; i++) {
            System.out.println("Adjon meg egy hőmérsékleti adatot: ");
            float getTemperature = scanner.nextFloat();
            temperatures[i] = getTemperature;
        }

    }

    public static float printHighestTemperature() {
        float highestTemp = temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > highestTemp) highestTemp = temperatures[i];
        }
        return highestTemp;
    }

    public static float printLowestTemperature() {
        float lowestTemp = temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] < lowestTemp) lowestTemp = temperatures[i];
        }
        return lowestTemp;
    }


}

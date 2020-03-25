package HeatIndex;

import java.util.Scanner;

public class HeatIndex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("NOAA's National Weather Service");
        System.out.println("Heat Index");
        System.out.println(" ");
        System.out.println("Relative Temperature(f)");
        System.out.println("Humidity(%)");

        System.out.printf("       ");

        //temperature
        for (int temperature = 80; temperature <= 110; temperature = temperature + 2) {
            System.out.printf("%6d", temperature);
        }
        System.out.println();
        System.out.println("_______________________________________________________________________________________________________________ ");

        //relative humidity
        for (int hmdty = 40; hmdty <= 100; hmdty = hmdty + 5) {
            System.out.printf("%3d | ", hmdty);


            // heat index
            for (int a = 80; a <= 110; a = a + 2) {
                //calculations
                String blank = " ";

                int calc = (int) (-42.379 + (2.04901523 * a) + (10.14333127 * hmdty) -
                        (.22475541 * a * hmdty) - (.00683783 * a * a) - (.05481717 * hmdty * hmdty) +
                        (.00122874 * a * a * hmdty) + (.00085282 * a * hmdty * hmdty) - .00000199 * a * a * hmdty * hmdty);
                if (calc <= 137) {
                    System.out.printf("%6d", calc);
                } else
                    System.out.printf("%6s", blank);
            }
            System.out.println();
        }


        //ending
        boolean run = true;
        while (run == true) {
            System.out.println("Enter Temp 0 to end: ");
            double temperature2 = scan.nextDouble();
            if (temperature2 == 0) {
                run = false;
                System.out.println("You quit");
                break;
            }

            //outcomes
            System.out.println("Enter relative humidity: ");
            double hmdty2 = scan.nextDouble();
            double thi = -42.379 + (2.04901523 * temperature2) + (10.14333127 * hmdty2) -
                    (.22475541 * temperature2 * hmdty2) - (.00683783 * temperature2 * temperature2) - (.05481717 * hmdty2 * hmdty2) +
                    (.00122874 * temperature2 * temperature2 * hmdty2) + (.00085282 * temperature2 * hmdty2 * hmdty2) - .00000199 * temperature2 * temperature2 * hmdty2 * hmdty2;
            System.out.println("The THI for temperature of " + (int) temperature2 + " and relative humidity of " + (int) hmdty2 + " is " + (int) thi);

            if (thi <= 90) {
                System.out.println("Advisory: Caution ");
            } else if (thi < 105) {
                System.out.println("Advisory: Extreme Caution");
            } else if (thi < 126) {
                System.out.println("Advisory: Danger");
            } else {
                System.out.println("Advisory: Extreme Danger");


            }
        }
    }
}
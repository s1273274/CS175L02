package CarCostCal;

import java.util.Scanner;

public class CarCostCalculation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cost of regular Car");
        double CostOfRegularCar = scan.nextDouble();

        System.out.println("Enter Miles per Gallon of regular car ");
        double MilesPerGallonOfRegCar = scan.nextDouble();

        System.out.println("Enter cost of Hybrid Car");
        double CostOfHybridCar = scan.nextDouble();

        System.out.println("Enter miles per gallon of hybrid Car ");
        double MilesPerGallonHybridCar = scan.nextDouble();

        System.out.println("Enter Miles traveled in a year ");
        double MilesTraveledInYear = scan.nextDouble();

        System.out.println("Enter Cost per Gallon");
        double CostPerGallon = scan.nextDouble();

        //Calculations
        double YearGasReg = (CostPerGallon * ( MilesTraveledInYear/ MilesPerGallonOfRegCar));
        double YearReg = CostOfRegularCar + YearGasReg;
        double Year2Reg = YearGasReg+ YearReg;
        double Year3Reg = YearGasReg + Year2Reg;
        double Year4Reg = YearGasReg + Year3Reg;
        double Year5Reg = YearGasReg + Year4Reg;
        double YearGasHyb = (CostPerGallon*(MilesTraveledInYear/MilesPerGallonHybridCar));
        double YearHyb = CostOfHybridCar + YearGasHyb;
        double Year2Hyb = YearGasHyb + YearHyb;
        double Year3Hyb = YearGasHyb + Year2Hyb;
        double Year4Hyb = YearGasHyb + Year3Hyb;
        double Year5Hyb = YearGasHyb + Year4Hyb;

        System.out.println("Cost to own after Year 1 for Regular Car: " + YearReg + "for hybrid car: " + YearHyb);
        System.out.println("Cost to own after Year 2 for Regular Car: " + Year2Reg + "for hybrid car: " + Year2Hyb);
        System.out.println("Cost to own after Year 3 for Regular Car: " + Year3Reg + "for hybrid car: " + Year3Hyb);
        System.out.println("Cost to own after Year 4 for Regular Car: " + Year4Reg + "for hybrid car: " + Year4Hyb);
        System.out.println("Cost to own after year 5 for Regular Car; " + Year5Reg + "for hybrid car; " + Year5Hyb);





























    }
}

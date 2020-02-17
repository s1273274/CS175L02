package CarCostCalculationVersion2;

import org.w3c.dom.ls.LSParserFilter;

import javax.swing.*;
import java.util.Scanner;

public class CarCostCalculationVersion2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter information of Regular Car (Car make and model, cost to purchase, miles per gallon)");
        String RegInfo = scan.nextLine();

        System.out.println("Enter information for the hybrid car ( Car make and model, cost to purchase, miles per gallon0");
        String HybridInfo = scan.nextLine();

        System.out.println("Enter miles traveled in a year");
        double MilesTraveled = scan.nextDouble();

        System.out.println("Enter cost per gallon of gas");
        double CostPerGallon = scan.nextDouble();


        //splits and Variables from u put
        String CarModelReg = RegInfo.substring(0,14);
        String CostToPurchaseReg = RegInfo.substring(15,20);
        String MilesPerGallon = RegInfo.substring(21,23);
        int CostOfRegularCar = Integer.parseInt(CostToPurchaseReg);
        int MilesPerGallonOfRegCar = Integer.parseInt(MilesPerGallon);

        String CarModelHyb = HybridInfo.substring(0,12);
        String CostToPurchaseHyb = HybridInfo.substring(13,18);
        String MilePerGallon = HybridInfo.substring(19,21);
        int CostOfHybridCar = Integer.parseInt(CostToPurchaseHyb);
        int MilesPerGallonHybridCar = Integer.parseInt(MilesPerGallon);


        double YearGasReg = (CostPerGallon * ( MilesTraveled/ MilesPerGallonOfRegCar));
        double YearReg = CostOfRegularCar + YearGasReg;
        double Year2Reg = YearGasReg+ YearReg;
        double Year3Reg = YearGasReg + Year2Reg;
        double Year4Reg = YearGasReg + Year3Reg;
        double Year5Reg = YearGasReg + Year4Reg;
        double YearGasHyb = (CostPerGallon*(MilesTraveled/MilesPerGallonHybridCar));
        double YearHyb = CostOfHybridCar + YearGasHyb;
        double Year2Hyb = YearGasHyb + YearHyb;
        double Year3Hyb = YearGasHyb + Year2Hyb;
        double Year4Hyb = YearGasHyb + Year3Hyb;
        double Year5Hyb = YearGasHyb + Year4Hyb;

        System.out.println("Cost to own " +CarModelReg + " After Year 1 is " + YearReg + " for " + CarModelHyb + ": " + YearHyb);
        System.out.println("Cost to own " +CarModelReg + " After Year 2 is " + Year2Reg + " for " + CarModelHyb + ": " + Year2Hyb);
        System.out.println("Cost to own " +CarModelReg + " After Year 3 is " + Year3Reg + " for " + CarModelHyb + ": " + Year3Hyb);
        System.out.println("Cost to own " +CarModelReg + " After Year 4 is " + Year4Reg + " for " + CarModelHyb + ": " + Year4Hyb);
        System.out.println("Cost to own " +CarModelReg + " After Year 5 is " + Year5Reg + " for " + CarModelHyb + ": " + Year5Hyb);

        if (Year5Hyb < Year5Reg)
        System.out.println("The Toyota Prius pays back after 5 years ");
        else
        System.out.println("The Toyota Prius does'nt pay back after 5 years");















    }









}

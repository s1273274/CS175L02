package GroceryDiscount;

import java.util.Scanner;

public class GroceryDiscount {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        boolean program;


        final double Rate1 = .08;
        final double Rate2 = .10;
        final double Rate3 = .12;
        final double Rate4 = .14;
        final double Rate1_Limit = 10;
        final double Rate2_Limit = 60;
        final double Rate3_Limit = 150;
        final double Rate4_Limit = 210;
        double discount = 0;

        while (program = true) {

            System.out.println("please enter the cost of your groceries or '0' to quit ");
            double bill = scan.nextDouble();
            if (bill == 0) {
                break;
            }
            else if (bill < 10) {
                System.out.println("You are not eligible for coupon this time ");
            }
            else if (bill >= Rate1_Limit && bill <= Rate2_Limit) {
                discount = bill * Rate1;
                System.out.println("You win a discount of $" + discount + "(8 percent of your purchase)");
            }
            else if (bill >= Rate2_Limit && bill <= Rate3_Limit) {
                discount = bill * Rate2;
                System.out.println("You win a discount of $" + discount + "(10 percent of your purchase)");
            }
            else if (bill >= Rate3_Limit && bill <= Rate4_Limit) {
                discount = bill * Rate3;
                System.out.println("You win a discount of $" + discount + "(12 percent of your purchase)");
            }
            else if (bill >= Rate4_Limit) {
                discount = bill * Rate4;
                System.out.println("You win a discount of $" + discount + "(14 percent of your purchase)");
            }
        }







        //System.out.println("Please enter the cost of your groceries or '0' to quit " );
        //double cost = scan.nextDouble();































    }
}

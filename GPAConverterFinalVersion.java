package GPAConverterFinalVersion;

import java.util.Scanner;

public class GPAConverterFinalVersion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numberGrade = 0.0;
        double GPA = 0.0;
        double finalGPA = 0.0;
        double TotalPoints = 0.0;
        double Totalcredit =0;
        //int Totalcredit = 0;
        //int TotalPoints =0;
        int Credit = 0;

        String Courselist = null;
        String Courseinfo = null;

        System.out.println("Enter the amount of classes you need to enter: ");
        int amount = scan.nextInt();
        for (int i = 0; i < amount; i++) {

            System.out.println("Enter the course information (Title,Credit hours,Letter grade (grade can be followed by + or -), or enter Q to quit: ");

            while (scan.hasNext()) {

                Courseinfo = scan.next();

                if (Courseinfo.equals("Q")) {
                    break;
                }
                String[] data = Courseinfo.split(",");
                String info = data[0];
                int hours = Integer.parseInt(data[1]);
                String grade = data[2];

                Credit = hours;
                Courselist = info;
                Totalcredit += hours;


                System.out.println("Course: " + Courselist);
                System.out.println("Credits: " + Credit + " (" + Totalcredit + " total)");


                if (grade.equals("A") || grade.equals("A+")) {
                    numberGrade = 4.0;
                    finalGPA += numberGrade;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                } else if (grade.equals("A-")) {
                    numberGrade = 3.7;
                    finalGPA += numberGrade;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                } else if (grade.equals("B+")) {
                    numberGrade = 3.3;
                    finalGPA += numberGrade;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                } else if (grade.equals("B")) {
                    numberGrade = 3.0;
                    finalGPA += numberGrade;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                } else if (grade.equals("B-")) {
                    numberGrade = 2.7;
                    finalGPA += numberGrade;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                } else if (grade.equals("C+")) {
                    numberGrade = 2.3;
                    finalGPA += numberGrade;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                } else if (grade.equals("C")) {
                    numberGrade = 2.0;
                    finalGPA += numberGrade;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                } else if (grade.equals("C-")) {
                    numberGrade = 1.7;
                    finalGPA += numberGrade;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                } else if (grade.equals("D+")) {
                    numberGrade = 1.3;
                    finalGPA += numberGrade;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                } else if (grade.equals("D")) {
                    numberGrade = 1.0;
                    finalGPA += numberGrade;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                } else if (grade.equals("F")) {
                    numberGrade = 0;
                    finalGPA += numberGrade;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                } else {
                    System.out.println("Invalid Letter Grade");

                }

            }
            double gradePoints = Credit*numberGrade;
            Totalcredit = Credit+Totalcredit;
            TotalPoints = gradePoints + TotalPoints;
            GPA = TotalPoints/Totalcredit;
            System.out.println("Course " + Courseinfo + "credits" + Credit + "Grade" + gradePoints);

        }
        System.out.println(GPA);


    }
}


































    

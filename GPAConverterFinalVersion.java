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
        double Grade = 0;

        System.out.println("Enter the amount of classes you need to enter: ");
        int amount = scan.nextInt();
        for (int i = 0; i < amount; i++) {

            System.out.println("Enter the course information (Title,Credit hours,Letter grade (grade can be followed by + or -), or enter Q to quit: ");



                Courseinfo = scan.next();

                if (Courseinfo.equals("Q")) {
                    break;
                }
                String[] data = Courseinfo.split(",");
                String info = data[0];
                String hours = (data[1]);
                String grade = data[2];
                int credit = Integer.parseInt(hours);


                //Courselist = info;



                //System.out.println("Course: " + Courselist);
                //System.out.println("Credits: " + Credit + " (" + Totalcredit + " total)");


                if (grade.equals("A") || grade.equals("A+")) {
                    numberGrade = 4.0;
                    Grade = numberGrade * credit;
                    finalGPA += Grade;
                    Totalcredit += credit;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                    System.out.println("Credits: " + credit + " (" + Totalcredit + " total)");
                    System.out.println("Course " + info + " credits " + credit + " Grade " + grade + " Grade Point " + Grade);
                } else if (grade.equals("A-")) {
                    numberGrade = 3.7;
                    Grade = numberGrade * credit;
                    finalGPA += Grade;
                    Totalcredit += credit;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                    System.out.println("Credits: " + credit + " (" + Totalcredit + " total)");
                    System.out.println("Course " + info + " credits " + credit + " Grade " + grade + " Grade Point " + Grade);
                } else if (grade.equals("B+")) {
                    numberGrade = 3.3;
                    Grade = numberGrade * credit;
                    finalGPA += Grade;
                    Totalcredit += credit;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                    System.out.println("Credits: " + credit + " (" + Totalcredit + " total)");
                    System.out.println("Course " + info + " credits " + credit + " Grade " + grade + " Grade Point " + Grade);
                } else if (grade.equals("B")) {
                    numberGrade = 3.0;
                    Grade = numberGrade * credit;
                    finalGPA += Grade;
                    Totalcredit += credit;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                    System.out.println("Credits: " + credit + " (" + Totalcredit + " total)");
                    System.out.println("Course " + info + " credits " + credit + " Grade " + grade + " Grade Point " + Grade);
                } else if (grade.equals("B-")) {
                    numberGrade = 2.7;
                    Grade = numberGrade * credit;
                    finalGPA += Grade;
                    Totalcredit += credit;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                    System.out.println("Credits: " + credit + " (" + Totalcredit + " total)");
                    System.out.println("Course " + info + " credits " + credit + " Grade " + grade + " Grade Point " + Grade);
                } else if (grade.equals("C+")) {
                    numberGrade = 2.3;
                    Grade = numberGrade * credit;
                    finalGPA += Grade;
                    Totalcredit += credit;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                    System.out.println("Credits: " + credit + " (" + Totalcredit + " total)");
                    System.out.println("Course " + info + " credits " + credit + " Grade " + grade + " Grade Point " + Grade);
                } else if (grade.equals("C")) {
                    numberGrade = 2.0;
                    Grade = numberGrade * credit;
                    finalGPA += Grade;
                    Totalcredit += credit;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                    System.out.println("Credits: " + credit + " (" + Totalcredit + " total)");
                    System.out.println("Course " + info + " credits " + credit + " Grade " + grade + " Grade Point " + Grade);
                } else if (grade.equals("C-")) {
                    numberGrade = 1.7;
                    Grade = numberGrade * credit;
                    finalGPA += Grade;
                    Totalcredit += credit;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                    System.out.println("Credits: " + credit + " (" + Totalcredit + " total)");
                    System.out.println("Course " + info + " credits " + credit + " Grade " + grade + " Grade Point " + Grade);
                } else if (grade.equals("D+")) {
                    numberGrade = 1.3;
                    Grade = numberGrade * credit;
                    finalGPA += Grade;
                    Totalcredit += credit;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                    System.out.println("Credits: " + credit + " (" + Totalcredit + " total)");
                    System.out.println("Course " + info + " credits " + credit + " Grade " + grade + " Grade Point " + Grade);
                } else if (grade.equals("D")) {
                    numberGrade = 1.0;
                    Grade = numberGrade * credit;
                    finalGPA += Grade;
                    Totalcredit += credit;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total)");
                    System.out.println("Credits: " + credit + " (" + Totalcredit + " total)");
                    System.out.println("Course " + info + " credits " + credit + " Grade " + grade + " Grade Point " + Grade);
                } else if (grade.equals("F")) {
                    numberGrade = 0;
                    Grade = numberGrade * credit;
                    finalGPA += Grade;
                    Totalcredit += credit;
                    System.out.println("The numeric value is: " + numberGrade + " (" + finalGPA + " total )");
                    System.out.println("Credits: " + Credit + " (" + Totalcredit + " total)");
                    System.out.println("Course " + info + " credits " + credit + " Grade " + grade + " Grade Point " + Grade);
                } else {
                    System.out.println("Invalid Letter Grade");

                }

            }
            double gradePoints = Credit*numberGrade;

            GPA = finalGPA/Totalcredit;

            System.out.println("your gpa is " + GPA);

        }



    }



































    

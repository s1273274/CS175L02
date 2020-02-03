package housePainting;
import java.util.Scanner;
public class housePainting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		//Accept all dimensions 
		System.out.print("Enter length of the house");
		int houseLength = scan.nextInt();
		
		System.out.print("Enter width of the house.");
		int houseWidth = scan.nextInt(); 
		
		System.out.print("Enter Hieght of the house");
		int houseHeight = scan.nextInt(); 
		
		System.out.print("Number of windows.");
		int numberOfWindows = scan.nextInt();
		
		System.out.print("Enter length of the window");
		int windowLength = scan.nextInt();
		
		System.out.print("Enter width of the window.");
		int windowWidth = scan.nextInt(); 
	
		System.out.print("Number of doors.");
		int numberOfdoors = scan.nextInt();
		
		System.out.print("Enter length of the door");
		int doorLength = scan.nextInt();
		
		System.out.print("Enter width of the door.");
		int doorWidth = scan.nextInt(); 
		
		int windowSquareFeet = (numberOfWindows * windowLength *  windowWidth); 
		int doorSquareFeet = (numberOfdoors * doorLength * doorWidth); 
		
		double houseSqFt = 2*(houseLength * houseWidth) + 2*(houseLength * houseWidth+ .5*(houseLength*(houseHeight - houseWidth)));
		System.out.println(houseSqFt);
		double SqFtToPaint = ( houseSqFt - (windowSquareFeet + doorSquareFeet)); 
		System.out.println(SqFtToPaint);
		
		
		
		//double sqFtToPaint = 
		
		
		
		
		
		
		
			
		
		
		
		//int houseSqFT = houseLength * houseWidth;
		//System.out.print("The square footage is:" +  houseSqFT); 
		

	}

}

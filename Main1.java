/* 

import java.util.Scanner;

public class ccc_j1_2012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);

		System.out.printf("Enter Speed Limit: ");
		int num = in.nextInt();
		
		System.out.printf("Enter your speed ");
		int num2 = in.nextInt();
		
		if (num > num2) { 
			
			System.out.printf("Congratulations, you are not within the speed limit!");
			
		}
		
		if ((num < num2) && (num2 > num + 20)) { 
			
			System.out.printf("You are speeding and your fine is $100");	
		}
		
		if ((num < num2 + 20) && (num2 > num + 30)) { 
			
			System.out.printf("You are speeding and your fine is $270");

		}
		
		if (num2 > num + 30) { 
			
			System.out.printf("You are speeding and your fine is $500");

		}
		
		

	}

	
	*/ 
	
	
import java.util.Scanner;

	public class Main1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		int fine = 0;
		int reclimit = 0;
		int slimit = 0;
		int input = 0;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the speed limit: ");

		input = s.nextInt();	

		slimit = input;

		System.out.print("Enter the recorded speed of the car: ");

		input = s.nextInt();

		reclimit = input;

			if(reclimit - slimit > 0 && reclimit - slimit < 21) {

				fine = 100;
	System.out.print("You are speeding and your fine is $" + fine + ".");
	}
			
			
			else if(reclimit - slimit > 20 && reclimit - slimit <= 30) {
	fine = 270;
	System.out.print("You are speeding and your fine is $" + fine + ".");
	}
			else if(reclimit - slimit > 30) {
	fine = 500;
	System.out.print("You are speeding and your fine is $" + fine + ".");
	}
			
			
			else {
	fine = 0;
	System.out.print("Congratulations, you are within the speed limit!");
	}










	}//END MAIN

	
	
		
		
	
	
	
	
	

}



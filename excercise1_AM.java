import java.util.Scanner;

public class excercise1_AM {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in); 

		
		double area = 0; 
		double r = 9;
		double volume = 0; 
		double h = 0; 
		
		
		// TODO Auto-generated method stub
		System.out.println("Calculation 1: Area of a cricle"); 
		
		System.out.print("Input radius of a circle"); 
		r = s.nextDouble(); 

				
		
		
		area = (22.0/7) * r * r; 
		
		System.out.println("A circle with radius "+r+" has an area " +area);
		
		
		
System.out.println("Calculation 2: Volume of a circle"); 
		
		System.out.print("Input radius "); 
		r = s.nextDouble(); 
		System.out.print("Input height ");  
		h = s.nextDouble(); 
				
		
		
		volume = (22.0/7) * r * r * h  ; 
		
		System.out.println("A cylinder with radius "+r+" and height "+h+" has an area " + volume);
		

	}

}

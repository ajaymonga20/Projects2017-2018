import java.util.Scanner;



public class Mainer {

	public static void main(String[] args) {
		int x = 0;
		int y = 0; 

			
		Scanner s = new Scanner(System.in);

		x = s.nextInt();
		
		y = s.nextInt();
		
		
		if (x > 0 && y > 0) { 
			
			System.out.print("1");
			
			
			
		}
		
		if (x < 0 && y > 0) { 
			
			System.out.print("2");
			
			
			
		}
		
		
		if (x < 0 && y < 0) { 
			
			System.out.print("3");
			
			
			
		}
		
		if (x > 0 && y < 0) { 
			
			System.out.print("4");
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}

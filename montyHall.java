import java.util.Random;
import java.util.Scanner;

public class montyHall {
	
	


	public static void main(String[] args) {
		
		Scanner numsIn = new Scanner(System.in);
		int answer = 0;
		
		int door1 = 1; 
		int door2 = 2; 
		int door3 = 3; 
		
		
		Random rand = new Random(); 
		
		
			int n = rand.nextInt(3) + 1;
			
			/* 
			
			if (n == 1) { 
				
				int nn = n + 1; 
				
			if (n == 2) { 
					
					nn = n - 1; 
					
			if (n == 3) { 
					nn = n - 1; 	
				}

			
				}
				
				
			}
			
			*/ 
			
			
			
			Scanner in = new Scanner(System.in);
			
			System.out.printf("Pick a door:  ");
			int num = in.nextInt();
			
			if (num == n || num != n) { 
				
				
				if (n == 1) { 
					
					int nn = n + 1;
					System.out.println("Not " + nn);
				} 
					
				if (n == 2) { 
					int nn = n - 1;
					System.out.println("Not " + nn);

				} 
						
				if (n == 3) { 
						int nn = n - 1; 
						System.out.println("Not " + nn);

					}

				
				
				System.out.println("New n");
				System.out.printf("Pick a door:  ");
				int num2 = in.nextInt();	
				
				
				
				if (num2 == n) { 
					
					System.out.println("Correct");				
				
			}
			
				
				System.out.println(n);
				
				
				
				
				
			}
			 
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			
			


		
		
		
		
		

	}

}

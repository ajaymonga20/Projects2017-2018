import java.util.Scanner;

public class ReadingInputs {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner s = new Scanner(System.in);
			int input1 = 0;
			int input2 = 0;
			int ctr = 0;
			String values = " ";

			do {

				input1 = s.nextInt();
				input2 = s.nextInt();
				ctr++;
				values = input1 + " " + input2 + " ";

			} while (input1 != 0 && input2 != 0);

			int[] data = new int[ctr];
			//The hard part is pulling things out of the string
			//1. Converting a string to an integer
			//Step 1: I use the indexOf function to find the first index of the space

			int loc1 = 0;
			int loc2 = values.indexOf(" ");


			System.out.println("END PROGRAM");

		
		

	}

}

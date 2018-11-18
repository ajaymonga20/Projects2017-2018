
	
	
import java.util.Scanner;

	public class Main6 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	solution();
	}

	public static void solution() {

	Scanner s = new Scanner(System.in);
	int depth1 = 0;
	int depth2 = 0;
	int depth3 = 0;
	int depth4 = 0;

	System.out.print("Enter the first depth");
	depth1 = s.nextInt();
	System.out.print("Enter the second depth");
	depth2 = s.nextInt();
	System.out.print("Enter the third depth");
	depth3 = s.nextInt();
	System.out.print("Enter the fourth depth");
	depth4 = s.nextInt();

	if (depth1 < depth2 && depth2 < depth3 && depth3 < depth4) {
	System.out.println("Fish Diving");
	}
	else if (depth1 > depth2 && depth2 > depth3 && depth3 > depth4) {
	System.out.println("Fish Rising");
	}
	else if (depth1 == depth2 && depth2 == depth3 && depth3 == depth4) {
	System.out.println("Fish At Consonant");
	}
	else {
	System.out.println("No Fish");
	}
	}
	}
	
	



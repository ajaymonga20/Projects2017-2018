
public class MCDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		/*
		 * With this approch you have to be delibrate in  how you set it up!
		 * 
		 */
		String[] q1 = {"What is Mr. Miskew's first name?","A) Bob","B) Frank","C) Paul","D) Ajay","C"};
		
		//By creating the question as an array we can simply print out the array to generate the quest
		//on the screen
		
		int split = 2;
		for (int i = 0; i < q1.length - 1; i = i + 1) {
			
			if (split != i) {
				System.out.println(q1[i]);
		
			}
			
			
			
			
			
		}
		
		
	}

}

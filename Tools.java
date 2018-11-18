public static int takeInteger(String prompt) {

	
	boolean found = false;

while(found == false) {


try {

	
	Scanner s = new Scanner(System.in);

	System.out.print(prompt);

	int x = s.nextInt();

	return x;
}



catch(Exception e) {

	
	
	System.out.println("DUDE THATS NOT AN INTEGER");

};

}

return -1;

}


Scanner s = new Scanner(System.in); 


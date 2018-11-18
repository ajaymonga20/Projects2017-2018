import java.util.Random;
import java.util.Scanner;

/*
 * GOALS:
 * 
 * 	- I want to set up your basic template. 
 *  - I want to set you up so you can take inputs of string and numeric type
 *  - I want to get you out of the main. 
 *  
 */ 


/**
 * 
 * Class headers explain your code
 * @author ajay.monga
 *
 */
public class Assignment1_AM_Demo {
	
	public static void game() {
		
		//Variables - game method.  They only exist in the game method
		Scanner wordsIn = new Scanner(System.in);
		Scanner numsIn = new Scanner(System.in);
		
		Random rand = new Random(); //This creates a random object called rand. By declaring it up here you can reuse it all you want. 
		
		
		String answer = "";
		
		int score = 0; 
		int split = 2; 
		int count = 0; 
		
		System.out.println("Welcome to Who Wants to Be a Millionaire!!!");
		System.out.println(".");
		System.out.println("I'm your host, Chris Harrison and I will guide you through the game");
		System.out.println(".");		
		
		System.out.println("Lets get started shall we?");
		System.out.println("The Rules are simple");
		System.out.println("I will give you questions of increasing diffucutly and increasing cash value");
		System.out.println("If you get anyone wrong, you lose everything!");
		System.out.println("But answer 14 in a row correcty, And you could become a millionaire!!!!!!");
		
		
		
		
		//Problem: If the user types in anything other than yes the program continues.
		//When taking inputs conditional loops are perfect. Conditional loops
		//are used when we don't know how many times something should run. 
		//Two types of conditional loops:
		//
		//1. While loop:  	This is an if statement but we switch the word
		//					if with while. IT MIGHT SKIP IT.
		//
		//2. do while loop: This is like a while loop.  IT WILL ALWAYS
		//					RUN ONCE.
		
		do { 
			
			
			
			
			System.out.println("Are you ready?");
			System.out.println("Yes or No ");

			System.out.println("answer: ");
			answer = wordsIn.nextLine(); //take a line of text. 
		
			//We want to analyse what the user inputs.
			//Trick: With strings you can check more combination if you convert the string
			//		 to upper or lower case. 
			//I WOULD LIKE YOU SEE YOU SET UP A LOOP TO ENSURE THE INPUT IS VALID
			
			
			answer = answer.toUpperCase();
		
			if (answer.equals("YES") == false && answer.equals("NO") == false) {
				System.out.println("Invalid input!");
				count = count + 1; 
				
				
				if (count == 3) { 
					
					System.out.println("Game over!"); 
					/*
					 * Theory about return. As soon as the program reaches a return statement 
					 * It stops and leaves the method. So if the program reaches this line is exits
					 * to where game was called from. Essentially ending the game. 
					 * 
					 * Note that void means this function returns nothing!  That is why there
					 * is nothing with the return statement. 
					 */
					return; 
					
				}
				
				
			}
			
			
		} while (answer.equals("YES") == false && answer.equals("NO") == false);
			
		
		
			
		if (answer.equals("YES")) {
			
			
			
			
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println("Your first question is for $500");
			
			System.out.println("."); 
			System.out.println("What is the only Man Made object visible from the moon?   ");
			System.out.println("To eliminate 2 of the incorrect objects type < split >, note you only have 2 of these per game!  "); 
			System.out.println(".");
			System.out.println("A) The Great Sphinx of Giza");
			System.out.println("B) The Taj Mahal");
			System.out.println("C) The Great Wall of China");
			System.out.println("D) Golden Gate Bridge");
			
			
			
			
			
			
			System.out.print("answer: ");
			answer = wordsIn.nextLine();
			answer = answer.toUpperCase();
			
			
			
			// Split function reduces it to 2 multiple choice options 
			
			if (answer.equals("SPLIT")) {
			
				split = split - 1; 
				
				int n = rand.nextInt(3) + 1; 
					
				if (n == 1) { 
					
					System.out.println("It is not A or B");	
					System.out.println(".");
					System.out.println("C) The Great Wall of China");
					System.out.println("D) Golden Gate Bridge");
					System.out.print("answer: ");
					answer = wordsIn.nextLine();
					answer = answer.toUpperCase();

				}
				else if (n == 2) { 
					
					System.out.println("It is not A or D");	
					System.out.println(".");
					System.out.println("B) The Taj Mahal");
					System.out.println("C) The Great Wall of China");
					System.out.print("answer: ");
					answer = wordsIn.nextLine();
					answer = answer.toUpperCase();
				}
				else if (n == 3) { 
					
					System.out.println("It is not B or D");	
					System.out.println(".");
					System.out.println("A) The Great Sphinx of Giza");
					System.out.println("C) The Great Wall of China");
					System.out.print("answer: ");
					answer = wordsIn.nextLine();
					answer = answer.toUpperCase();
				}
				
				
				
					
					

				
				
				
				
		/*		final String[] question1 = {"A", "B", "C", "D"};
				Random random = new Random();
				int index = random.nextInt(question1.length);
				System.out.println(question1[index]);
				
				final String[] question2 = {"A", "B", "C", "D"};
				Random random1 = new Random();
				int index1 = random.nextInt(question1.length);
				System.out.println(question1[index]);
				
				
				
*/ 
			
				
				
				
				
				
				
				
			}
			
			
			
			if (answer.equals("A") || answer.equals("B") || answer.equals("D")) { 
				
				System.out.println("That is incorrect");
				System.out.println("Your final score is: $" + score);
			}

			if (answer.equals("C")) { 
				
				System.out.println("That is Correct");
				System.out.println("You have just won $500");
				score = score + 500; 
				
				System.out.println(".");
				System.out.println(".");

				System.out.println("Your next question is for $1,000");
				System.out.println(".");
				
				System.out.println("Which US President campaigned with the slogan" + " \"Yes we Can\"? ");
				System.out.println(".");
				System.out.println("A) Donald Trump");
				System.out.println("B) Barack Obama");
				System.out.println("C) John F Kennedy");
				System.out.println("D) Ronald Reagan");

				System.out.print("answer: ");
				answer = wordsIn.nextLine();
				answer = answer.toUpperCase();
				
				

							
				if (answer.equals("A")) { 
					
					System.out.println("That is incorrect");
					System.out.println("Your final score is: $" + score);
				}

				if (answer.equals("C")) { 
					
					System.out.println("That is incorrect");
					System.out.println("Your final score is: $" + score);
				}

				if (answer.equals("D")) { 
					
					System.out.println("That is incorrect");
					System.out.println("Your final score is: $" + score);
				}
				
				
				
				if (answer.equals("B")) { 
					
					System.out.println("That is Correct");
					System.out.println("You have just won $1,000");
					score = 1000; 
					
					System.out.println(".");
					System.out.println(".");

					System.out.println("Your next question is for $2,000");
					System.out.println(".");
					
					System.out.println("Which of the following world capital cities are closest to one another?");

					System.out.println(".");
					System.out.println("A) Ottawa, Canada and Washington, USA");
					System.out.println("B) Stockholm, Sweden and Helsinki, Finland");
					System.out.println("C) Wellington, New Zealand and Canberra, Australia");
					System.out.println("D) Vatican City, Vatican City State and Rome, Italy");
					
					System.out.print("answer: ");
					answer = wordsIn.nextLine();
					answer = answer.toUpperCase();
					
					if (answer.equals("A")) { 
						
						System.out.println("That is incorrect");
						System.out.println("Your final score is: $1,000");
					}

					
					
					
					
					if (answer.equals("C")) { 
						
						System.out.println("That is incorrect");
						System.out.println("Your final score is: $1,000");
					}
					
					if (answer.equals("D")) { 
						
						System.out.println("That is Correct");
						System.out.println("You have just won $2,000");
						score = 2000; 
						
						System.out.println(".");
						System.out.println(".");

						System.out.println("Your next question is for $3,000");
						System.out.println(".");
						
						System.out.println("Which US city is referred to as" + " \"The City of Brotherly Love\"? " );

						System.out.println(".");
						System.out.println("A) Boston");
						System.out.println("B) Philadelphia");
						System.out.println("C) New York");
						System.out.println("D) Pittsburgh");
						
						System.out.print("answer: ");
						answer = wordsIn.nextLine();
						answer = answer.toUpperCase();
						
						if (answer.equals("A")) { 
							
							System.out.println("That is incorrect");
							System.out.println("Your final score is: $2,000");
							
							
						}
						
						if (answer.equals("C")) { 
							
							System.out.println("That is incorrect");
							System.out.println("Your final score is: $2,000");
							
							
						}
						
						if (answer.equals("D")) { 
							
							System.out.println("That is incorrect");
							System.out.println("Your final score is: $2,000");
							
						}
						
						
						if (answer.equals("B")) { 
							
							System.out.println("That is Correct");
							System.out.println("You have just won $3,000");
							score = 3000; 
							
							
						}
						
						
						System.out.println(".");
						System.out.println(".");

						System.out.println("Your next question is for $5,000");
						System.out.println(".");
						
						System.out.println("What colour jersey is worn by the winner of each stage of the Tour De France?");

						System.out.println(".");
						System.out.println("A) Yellow");
						System.out.println("B) Blue");
						System.out.println("C) Green");
						System.out.println("D) Red");
						
						System.out.print("answer: ");
						answer = wordsIn.nextLine();
						answer = answer.toUpperCase();
						
						if (answer.equals("B")) { 
							
							System.out.println("That is incorrect");
							System.out.println("Your final score is: $3,000");
							
							
						}
						
						if (answer.equals("C")) { 
							
							System.out.println("That is incorrect");
							System.out.println("Your final score is: $3,000");
							
							
						}
						
						if (answer.equals("D")) { 
							
							System.out.println("That is incorrect");
							System.out.println("Your final score is: $3,000");
							
						}
						
						
						if (answer.equals("A")) { 
							
							System.out.println("That is Correct");
							System.out.println("You have just won $5,000");
							score = 5000; 
							
							System.out.println(".");
							System.out.println(".");

							System.out.println("Your next question is for $7,000");
							System.out.println(".");
							
							System.out.println("What is the oldest professional sports league in North America?" );

							System.out.println(".");
							System.out.println("A) NHL");
							System.out.println("B) MLS");
							System.out.println("C) MLB");
							System.out.println("D) NBA");
							
							System.out.print("answer: ");
							answer = wordsIn.nextLine();
							answer = answer.toUpperCase();
							
							
							if (answer.equals("A")) { 
								
								System.out.println("That is incorrect");
								System.out.println("Your final score is: $5,000");
								
							}
							
							if (answer.equals("B")) { 
								
								System.out.println("That is incorrect");
								System.out.println("Your final score is: $5,000");
								
							}
							
							
							if (answer.equals("D")) { 
								
								System.out.println("That is incorrect");
								System.out.println("Your final score is: $5,000");
								
							}
							
							if (answer.equals("C")) { 
								
								System.out.println("That is Correct");
								System.out.println("You have just won 7,000");
								score = 5000; 
								
								System.out.println(".");
								System.out.println(".");

								System.out.println("Your next question is for $10,000");
								System.out.println(".");		
								
								System.out.println("Who is the top selling Canadian Musical Artist of all time?" );

								System.out.println(".");
								System.out.println("A) Celine Dion");
								System.out.println("B) Michael Buble");
								System.out.println("C) Shania Twain");
								System.out.println("D) The Tragically Hip");
								
								System.out.print("answer: ");
								answer = wordsIn.nextLine();
								answer = answer.toUpperCase(); 
								
								if (answer.equals("C")) { 
									
									System.out.println("That is incorrect");
									System.out.println("Your final score is: $7,000");
									
								}
								
								if (answer.equals("B")) { 
									
									System.out.println("That is incorrect");
									System.out.println("Your final score is: $7,000");
									
								}
								
								if (answer.equals("D")) { 
									
									System.out.println("That is incorrect");
									System.out.println("Your final score is: $7,000");
									
								}
								
								if (answer.equals("A")) { 
									
									System.out.println("That is Correct");
									System.out.println("You have just won $10,000");
									score = 10000;
									
									System.out.println(".");
									System.out.println(".");

									System.out.println("Your next question is for $20,000");
									System.out.println(".");
									
									System.out.println("Which of the following is not a monotheistic religion?" );

									System.out.println(".");
									System.out.println("A) Islam");
									System.out.println("B) Judaism");
									System.out.println("C) Hinduism");
									System.out.println("D) Christianity");
									
									System.out.print("answer: ");
									answer = wordsIn.nextLine();
									answer = answer.toUpperCase();
									
									
									if (answer.equals("A")) { 
										
										System.out.println("That is incorrect");
										System.out.println("Your final score is: $10,000");
										
									}
									
									if (answer.equals("B")) { 
										
										System.out.println("That is incorrect");
										System.out.println("Your final score is: $10,000");
										
									}
									
									if (answer.equals("D")) { 
										
										System.out.println("That is incorrect");
										System.out.println("Your final score is: $10,000");
										
									}
									
									if (answer.equals("C")) { 
										
										System.out.println("That is Correct");
										System.out.println("You have just won $20,000");
										score = 20000;
										
										System.out.println(".");
										System.out.println(".");

										System.out.println("Your next question is for $30,000");
										System.out.println(".");		
										
										System.out.println("Which language capitalizes all nouns?" );

										System.out.println(".");
										System.out.println("A) French");
										System.out.println("B) Italian");
										System.out.println("C) Spanish");
										System.out.println("D) German");
										
										System.out.print("answer: ");
										answer = wordsIn.nextLine();
										answer = answer.toUpperCase();
										
										
										if (answer.equals("A")) { 
											
											System.out.println("That is incorrect");
											System.out.println("Your final score is: $20,000");
											
										} 
										
										if (answer.equals("B")) { 
											
											System.out.println("That is incorrect");
											System.out.println("Your final score is: $20,000");
											
											
										}
										
										if (answer.equals("C")) { 
											
											System.out.println("That is incorrect");
											System.out.println("Your final score is: $20,000");
											
										}
										
										if (answer.equals("D")) { 
											
											System.out.println("That is Correct");
											System.out.println("You have just won $30,000");
											score = 30000;
											
											System.out.println(".");
											System.out.println(".");

											System.out.println("Your next question is for $50,000");
											System.out.println(".");		
											
											System.out.println("Which of the following countries is not part of Nato?");

											System.out.println(".");
											System.out.println("A) Sweden");
											System.out.println("B) Spain");
											System.out.println("C) Portugal");
											System.out.println("D) Slovenia");
											
											System.out.print("answer: ");
											answer = wordsIn.nextLine();
											answer = answer.toUpperCase();
											
											if (answer.equals("B")) { 
												
												System.out.println("That is incorrect");
												System.out.println("Your final score is: $20,000");
												
											} 
											
											if (answer.equals("C")) { 
												
												System.out.println("That is incorrect");
												System.out.println("Your final score is: $20,000");
												
												
											}
											
											if (answer.equals("D")) { 
												
												System.out.println("That is incorrect");
												System.out.println("Your final score is: $20,000");
												
											}
											
											if (answer.equals("A")) { 
												
												System.out.println("That is Correct");
												System.out.println("You have just won $50,000");
												System.out.println("You have just won $50,000");
												score = 30000;
												
												System.out.println(".");
												System.out.println(".");

												System.out.println("You have survived without making any mistakes!!");
												System.out.println(".");		
												
												System.out.println("You Have Also Made $50,000!!");
												
												
												
												
												
												
												
											
									
											
											
											
											
										
										
										
										
										
										
										
										
									}
									
									
									
									
									
									
									
								}
								
								
								
							}
						
						}
						
						
						
						
						
						
						
					}
					
				}
				
				
			}



		
			
			//IF YOU DIE YOU WANT TO EXIT THE METHOD
			return; //stops the method
		}
			
		} //end if statement
		
		} 
		
		
		
		
		
		
		
	}//end game 



	public static void main(String[] args) {
		
		//Variables - game method.  They only exist in the game method
		//Every method that takes inputs needs to have scanner objects. 
		Scanner wordsIn = new Scanner(System.in);
		Scanner numsIn = new Scanner(System.in);
				
		String input = "";
				
				
		System.out.println("Start Main");
	
		//Loop game:
		// To loop the game we will use a conditional loop called a do while loop
		// do while loops are perfect for situations where we must run the loop 
		// once. 
		
		
		do {
			
			game();
			
			// System.out.println("Play again? (YES/NO)");
			// System.out.print("Input: ");
			// input = wordsIn.nextLine();
			input = wordsIn.nextLine();
			
		} while (input.equalsIgnoreCase("yes"));
		
		
		
		
		// System.out.println("End Main");
		
	} //end main
	
	
}//end class
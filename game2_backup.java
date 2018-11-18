// Imports 

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;


public class game2_backup {

	
	// Reference type = Object type 
	private JFrame frame = new JFrame();
	
	
	private JPanel panel = new JPanel() {
	
		public void paint(Graphics g) {
			
			
			// Creates a new colour using RGB and fills the background with that colour 
			Color myNewBlue = new Color (75,0,130); 
			g.setColor(myNewBlue); // Sets my palette to my new colour
			g.fillRect(0, 0, 950, 590); // Fills a rectangle the size of the panel
			
			
			// Creates the "Money Ladder" 
			
			g.setColor(Color.ORANGE); 
			g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
			
			g.setFont(new Font("Arial", Font.BOLD, 27));
			g.drawString("Who Wants To Be A Millionaire", 300, 35);
			
			
			g.setColor(Color.ORANGE);

			g.setFont(new Font("Arial", Font.BOLD, 18));			
			g.drawRect(800, 489, 100, 50); // 1

			g.setColor(Color.ORANGE);
			g.setFont(new Font("Arial", Font.BOLD, 18));
			
			g.drawString("$1,000", 800, 539);
			
			
			g.drawRect(800, 489, 100, 50); // 2
			g.drawString("$5,000", 800, 489);
			
			
			g.drawRect(800, 439, 100, 50); // 3
			g.drawString("$10,000", 800, 439);
			
			
			g.drawRect(800, 389, 100, 50); // 4
			g.drawString("$25,000", 800, 389);
			

			g.drawRect(800, 339, 100, 50); // 5
			g.drawString("$50,000", 800, 339);
			
			g.drawRect(800, 289, 100, 50); // 6
			//g.setColor(Color.ORANGE);
			//g.fillRect(800, 289, 100, 50);
			
			
			
			g.setColor(Color.ORANGE);
			g.drawRect(800, 239, 100, 50); // 7
		//	g.fillRect(800, 239, 100, 50);
			g.drawString("$150,000", 800, 239);
			
	//		g.setColor(myNewBlue);
			g.drawString("$100,000", 800, 289);
			
			
			g.setColor(Color.ORANGE);
			
			
			g.drawRect(800, 189, 100, 50); // 8
			g.drawString("$250,000", 800, 189);
			
			
			g.drawRect(800, 139, 100, 50); // 9
			g.drawString("$500,000", 800, 139);
			
			
			g.drawRect(800, 89, 100, 50); // 10
			g.drawString("$1,000,000", 800, 89);
			
			g.drawRect(800, 39, 100, 50); // 1
			
			
			g.drawRect(40, 69, 240, 108);
			g.setFont(new Font("Arial", Font.BOLD, 32));
			g.drawString("Score:", 45, 100);
			g.drawString(score, 45, 150);
			
			g.setFont(new Font("Arial", Font.BOLD, 42));
			g.drawOval(80, 225, 165, 165);
			g.drawString("15000", 102, 320);

			
			g.setFont(new Font("Arial", Font.BOLD, 34));
			//g.drawString("TIME REMAINING", 370, 140);
			
			
			g.drawOval(400, 180, 165, 165);
			g.setFont(new Font("Arial", Font.BOLD, 100));
			//g.drawString(":29", 430, 290);
			g.drawString(""+countDown,427,300);
			
			


			if (state >= 1) {
				g.setColor(Color.GREEN);
				g.fillRect(800, 489, 100, 50); // 1
					
			}
			
			if (state >= 2) { 
				
				g.setColor(Color.GREEN);
				g.fillRect(800, 439, 100, 50);
				
				
				
				
				
			}
			
			
			if (state >= 3) { 
				
				g.setColor(Color.GREEN);
				g.fillRect(800, 389, 100, 50);				
				
			}
			
			if (state >= 4) {
				
				g.setColor(Color.GREEN);
				g.fillRect(800, 339, 100, 50);
				
				
			}
			
			if (state >= 5) {
				
				g.setColor(Color.GREEN);
				g.fillRect(800, 289, 100, 50);
				
				
			}
			
			if (state >= 6) {
				
				g.setColor(Color.GREEN);
				g.fillRect(800, 239, 100, 50);
				
				
			}
			
			if (state >= 7) {
				
				g.setColor(Color.GREEN);
				g.fillRect(800, 189, 100, 50);
				
				
			}
			
			if (state >= 8) {
				
				g.setColor(Color.GREEN);
				g.fillRect(800, 139, 100, 50);
				
				
			}
			
			if (state >= 9) {
				
				g.setColor(Color.GREEN);
				g.fillRect(800, 89, 100, 50);
				
				
			}
			
			
			
			
			if (state >= 10) {
				
				g.setColor(Color.GREEN);
				g.fillRect(800, 39, 100, 50);
				
				g.setColor(Color.ORANGE);
				g.fillRect(0, 0, 950, 590); // 1
				g.setColor(myNewBlue);
				g.setFont(new Font("Arial", Font.BOLD, 60));
				g.drawString("YOU HAVE WON! YOU ARE A MILLIONAIRE!", 50, 320);
				
				
			}
			
			
		
			
			
			
			
			// GAME OVER COMMAND 
			if (status >= 1) {
				g.setColor(Color.ORANGE);
				g.fillRect(0, 0, 950, 590); // 1
				
				g.setColor(myNewBlue);
				g.setFont(new Font("Arial", Font.BOLD, 60));
				g.drawString("GAME OVER!", 300, 320);
					
			}
			
			
			if (state == 1) {
				
				score = "$1,000"; 
				
				/*
				
				t.stop();
				countDown = 30;
				countDown = countDown - 1; 
				t.start();
				panel.repaint(); 
				
				*/

		        textArea.setText("Which US President campaigned with the slogan: Yes we Can ?");
		        
		        button1.setText("A: Kennedy");
		        button2.setText("B: Trump");
		        button3.setText("C: Obama");
		        button4.setText("D: Reagan");
		        
		        correctResponse = "C";
		        wrongAnswer = "A"; 
		        wrongAnswer1 = "B"; 
		        wrongAnswer2 = "D";
		        
		        System.out.println(state);
		        
			}
			
			
			if (state == 2) { 
				
				score = "$5,000"; 
				
				
				textArea.setText("Which of the following is not a monotheistic religion?");
		        
		        button1.setText("A: Islam");
		        button2.setText("B: Hinduism");
		        button3.setText("C: Judaism");
		        button4.setText("D: Christianity");
		        
		        correctResponse = "B";
		        wrongAnswer = "A"; 
		        wrongAnswer1 = "C"; 
		        wrongAnswer2 = "D"; 
		        
		        System.out.println(state);
				
				
				
			}
			
			
			if (state == 3) { 
				
				score = "$10,000"; 
				
				
				textArea.setText("Which language capitalizes all nouns?");
		        
		        button1.setText("A: French");
		        button2.setText("B: Italian");
		        button3.setText("C: Spanish");
		        button4.setText("D: German");
		        
		        correctResponse = "D";
		        wrongAnswer = "A"; 
		        wrongAnswer1 = "B"; 
		        wrongAnswer2 = "C"; 
		        
		        System.out.println(state);
				
				
				
			}
			
			if (state == 4) { 
				
				score = "$25,000"; 

				
				textArea.setText("Which of the following countries is not part of Nato?");
		        
		        button1.setText("A: Sweden");
		        button2.setText("B: Spain");
		        button3.setText("C: Portugal");
		        button4.setText("D: Slovenia");
		        
		        correctResponse = "A";
		        wrongAnswer = "B"; 
		        wrongAnswer1 = "C"; 
		        wrongAnswer2 = "D"; 
		        
		        System.out.println(state);
				
				
				
			}
			
			
			if (state == 5) { 
				
				score = "$50,000"; 

				
				textArea.setText("Who is the top selling Canadian Musical Artist of all time?");
		        
		        button1.setText("A: Celine Dion");
		        button2.setText("B: Shania Twain");
		        button3.setText("C: The Tragically Hip");
		        button4.setText("D: Michael Buble");
		        
		        correctResponse = "A";
		        wrongAnswer = "B"; 
		        wrongAnswer1 = "C"; 
		        wrongAnswer2 = "D"; 
		        
		        System.out.println(state);
				
				
				
			}
			
			if (state == 6) { 
				
				score = "$100,000"; 

				
				
				textArea.setText("What is the oldest professional sports league in North America?");
		        
		        button1.setText("A: NBA");
		        button2.setText("B: NHL");
		        button3.setText("C: MLB");
		        button4.setText("D: NFL");
		        
		        correctResponse = "C";
		        wrongAnswer = "A"; 
		        wrongAnswer1 = "B"; 
		        wrongAnswer2 = "D"; 
		        
		        System.out.println(state);
				
				
				
			}
			
			if (state == 7) { 
				
				score = "$150,000"; 

				
				textArea.setText("Which of the following world capital cities are closest to one another?");
		        
		        button1.setText("A) Ottawa, Canada and Washington, USA");
		        button2.setText("B) Stockholm, Sweden and Helsinki, Finland");
		        button3.setText("C) Wellington, New Zealand and Canberra, Australia");
		        button4.setText("D) Vatican City, Vatican City State and Rome, Italy");
		        
		        correctResponse = "D";
		        wrongAnswer = "A"; 
		        wrongAnswer1 = "B"; 
		        wrongAnswer2 = "C"; 
		        
		        System.out.println(state);
				
				
				
			}
			
			if (state == 8) { 
				
				score = "$250,000"; 

				
				
				textArea.setText("In what year did Canada get rid of the $2 Bill?");
		        
		        button1.setText("A) 1996");
		        button2.setText("B) 1989");
		        button3.setText("C) 1999");
		        button4.setText("D) 2001");
		        
		        correctResponse = "A";
		        wrongAnswer = "B"; 
		        wrongAnswer1 = "C"; 
		        wrongAnswer2 = "D"; 
		        
		        System.out.println(state);
				
				
				
			}
			
			if (state == 9) { 
				
				score = "$500,000"; 

				
				textArea.setText("Which US President spent the fewest days in office?");
		        
		        button1.setText("A) Abraham Lincoln");
		        button2.setText("B) John F. Kennedy");
		        button3.setText("C) William Henry Harrison");
		        button4.setText("D) Calvin Coolidge");
		        
		        correctResponse = "C";
		        wrongAnswer = "A"; 
		        wrongAnswer1 = "B"; 
		        wrongAnswer2 = "D"; 
		        
		        System.out.println(state);
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	};
	
	private JButton button1 = new JButton("A) Skopje");
	private JButton button2 = new JButton("B) Minsk");
	private JButton button3 = new JButton("C) Talinn");
	private JButton button4 = new JButton("D) Sarajevo");
	private JButton trueButton = new JButton("TRUE");

	
	public JTextArea textArea = new JTextArea("");
	
	
	
	

	private ActionListener buttonAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Button Pressed");
			
			//Step 1: Decide Which Button
			JButton temp = (JButton)(e.getSource());
			String ans = temp.getName();
			
			
			
			//To check if question is right
			if (ans.equals(correctResponse)) {
				state = state + 1;	
			}
			
			
			
			if (ans.equals(wrongAnswer) || ans.equals(wrongAnswer1) || ans.equals(wrongAnswer2)) {
				status = status + 1;
				
				
			//	gameover = true; 
				
				
				
				
			}
			
			
			//panel.repaint();
		}
		
		
	
		
	};  
		
	private ActionListener timerAction = new ActionListener() {
		
		//@override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("Timer Running");
			countDown = countDown - 1; 
			if (countDown == 0) { 
				
				t.stop(); 
				trueButton.setEnabled(false); 
			}
			
			panel.repaint(); 
			
		}
		
	
};
	
	private Timer t = new Timer(1000, timerAction); 
	
	
	//game variables
	private int state = 0;
	private int status = 0; 
	private boolean gameover = false;  
	private int countDown = 60;
	private String score = "$0"; 

	
	private String correctResponse = "A"; //1==A, 2==B, 3 == C, 4 == D
	
	
	private String wrongAnswer = "B"; 
	private String wrongAnswer1 = "C"; 
	private String wrongAnswer2 = "D"; 

	
	
	//Can you create 5 arrays for me. 
	private String[] question = {"What is the cpital of Macedonia?",};
	private String[] answerA = {"A: Skopje"}; //The answer pasted on A Button

	private String[] answerB = {"B: WRONG"}; //The answer pasted on A Button

	private String[] answerC = {"C: WRONG"}; //The answer pasted on A Button

	private String[] answerD = {"D: WRONG"}; //The answer pasted on A Button

	private String[] correctAnswer =  {"A"}; //The answer pasted on A Button
	
	public game2_backup() {
		
		
		
		textArea.setEditable(false);

		Font font = new Font("Arial", Font.BOLD, 26);
        textArea.setFont(font);
        textArea.setForeground(Color.BLUE);
        textArea.setText("What is the capital of Macedonia?");


		frame.setLocation(100, 100);
		frame.setLayout(new GridBagLayout());
		
		GridBagConstraints c1 = new GridBagConstraints(); 
		
		c1.gridx = 0; 
		c1.gridy = 0; 
		c1.gridwidth = 2; 
		
		
		panel.setPreferredSize(new Dimension(950, 590));

		frame.add(panel, c1); 
		
		GridBagConstraints c2 = new GridBagConstraints(); 
		
		c2.gridx = 0; 
		c2.gridy = 2; 
		
		button1.setName("A");
		button1.addActionListener(buttonAction);
		frame.add(button1, c2);
		
		GridBagConstraints c3 = new GridBagConstraints(); 
		
		c3.gridx = 1; 
		c3.gridy = 2; 
		
		
		button2.setName("B");
		button2.addActionListener(buttonAction);
		frame.add(button2, c3);
		
		GridBagConstraints c4 = new GridBagConstraints(); 
		
		c4.gridx = 0; 
		c4.gridy = 3; 
				
		
		button3.setName("C");
		button3.addActionListener(buttonAction);
		frame.add(button3, c4);
		
		
		GridBagConstraints c5 = new GridBagConstraints(); 
		
		c5.gridx = 1; 
		c5.gridy = 3; 
		
		
		button4.setName("D");	
		button4.addActionListener(buttonAction);
		frame.add(button4, c5);
		
		GridBagConstraints c6 = new GridBagConstraints();
		
		c6.gridx = 0;
		c6.gridy = 1;
		c6.gridwidth = 2;
		

		
		textArea.setRows(1);
		textArea.setColumns(10);
		
		frame.add(textArea, c6);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		
		
		
		frame.setVisible(true);
		
		t.start();

		
		
		
		
	} 
	
	
	public static void main(String[] args) { 
		
		game2_backup game = new game2_backup(); 
		
		
		
	} 
	
	}
	


 

 
	
	
	
	
	

	
	
	
	
	

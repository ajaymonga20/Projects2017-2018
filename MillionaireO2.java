

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;




public class  MillionaireO2 {

	//Attributes - Fields
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton submit = new JButton();
	private JButton help = new JButton();
	private JFormattedTextField answer = new JFormattedTextField();
	private JTextArea question = new JTextArea();
	private JTextPane top = new JTextPane();
	private JPanel image = new JPanel();
	
	
	
	String[] questionshockey = { "Question #1: How many goals did Wayne Gretzky score in his rookie season?", // Question 1																												
			"Question #2: Which player was the first in the NHL to score a full-strength, power play, short-handed, penalty shot, and open net goal in the same game?", // Question 2																																											
			"Question #3: How many Stanley Cups have the Toronto Maple Leafs won?", // Question 3
			"Question #4: What was the first American team in the NHL?", // Question 4
			"Question #5: Who scored the 'golden goal' in the 2010 olympics?", // Question 5
			"Question #6: Which team had a 35-game regular season unbeaten streak", // Question 6
			"Question #7: What was Toronto's NHL team's original nickname?", // Question 7
			"Question #8: How old was Gordie Howe in his final NHL game?", // Question 8
			"Question #9: What defencemen won 8 consecutive Norris Trophies?", // Question 9
			"Question #10: What player began curving the blade of the stick?" };// Question 10

	
	//Constructors
	public MillionaireO2() {

			frame.add(panel);
		
		//image
			image.setSize(1440, 200);
			image.setLocation(30, 30);
			image.setVisible(true);  			
			frame.add(image);		
		
		//frame		
			frame.setLayout(null);	
		
		
		//font
			Font GameFont= new Font("Arial", Font.BOLD, 30);
			Font TopFont = new Font("Arial", Font.BOLD, 12);
	
	    //Submit
			submit.setText("Submit");
			submit.setBounds(1140,640,300,137);
			submit.setFont(GameFont);
			submit.setBackground(Color.GREEN);
			System.out.println(submit.getBackground());
			frame.add(submit);
		
	    
		//help
			help.setText("Help");
			help.setBounds(1140,500,300,137);
			help.setFont(GameFont);
			help.setBackground(Color.YELLOW);
			frame.add(help);

		
		//Top of screen
			top.setText("   Your score is 0/10									Sports Trivia");
			top.setSize(1440, 20);
			top.setLocation(0, 0);
			top.setEditable(false);
			top.setFont(TopFont);
			top.setBackground(Color.BLACK);
			top.setForeground(Color.ORANGE);
			frame.add(top);

	    
		//Question
			question.setText(questionshockey[0]);
			question.setSize(1440, 75);
			question.setLocation(0, 425);
			question.setEditable(false);
			question.setFont(GameFont);
			question.setBackground(Color.BLACK);
			question.setForeground(Color.ORANGE);
			frame.add(question);

		
		

		
		//Answer
			answer.setSize(1140, 300);
			answer.setLocation(0, 500);
			answer.setFont(GameFont);
			answer.requestFocus();
			frame.add(answer);


			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(1440,850);
			frame.setResizable(false);
			frame.setVisible(true);
		
			
			

	}
	private ActionListener submitAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//Get Text
			String text = answer.getText();
			
			//Clear textField
			answer.setText("");
		
			//Print to textArea
			question.append("\n"+text);
			
			//set the focus on the frame to 
			//allow keylistener to work again
			frame.requestFocus();
		}
			
		
	
	};  

	//Behaviours - Methods
	
	
	//**********************
	public static void main(String[] args) {
		System.out.println("TEST");
		Game2_AJPM game = new Game2_AJPM;
	}
	

}
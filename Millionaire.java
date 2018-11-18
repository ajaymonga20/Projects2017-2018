import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;

/*  

public class Millionaire {
	
	// Fields - Attributes
	// GUI RELATED
	private JFrame frame = new JFrame("Game"); 
	
	private JTextArea display = new JTextArea(); 
	
	private JPanel panel = new JPanel() { 
		
		public void paint(Graphics g) { 		
		}
	
	}; 

	// GAME VARIABLES 
	// Constructors
	public Millionaire() { 
		
		frame.setLocation(100,100);
		frame.setLayout(new GridBagLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}

	// Methods - behaviours  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Millionaire game = new Millionaire(); 
		
		
		

	}

}

*/

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Millionaire {

	//Fields
	//GUI******************************************
	private JFrame frame = new JFrame("Game_NI");
	
	private JPanel panelMain = new JPanel() {
	
		public void paint(Graphics g) {
			
		//	g.drawString("Hello",12,12);
			
			g.setColor((Color.BLUE));
			Color myNewBlue = new Color (75,0,130);
			
			
			g.setColor(myNewBlue);
			g.fillRect(0, 0, 950, 590);
						
			
			
			
			g.setColor(Color.ORANGE);
			
			
			g.setFont(new Font("Arial", Font.BOLD, 27));
			g.drawString("Who Wants To Be A Millionaire", 300, 35);
			

			//g.drawOval(300, 300, 30, 30);
			
			//g.fillRect(344,23,233,199);
			
			g.setColor(Color.ORANGE);

			g.setFont(new Font("Arial", Font.BOLD, 18));			
			g.drawRect(849, 539, 100, 50); // 1
			g.drawString("$1000", 849, 589);
			
			
			g.drawRect(849, 489, 100, 50); // 2
			g.drawString("$5000", 849, 539);
			
			
			g.drawRect(849, 439, 100, 50); // 3
			g.drawString("$10,000", 849, 489);
			
			
			g.drawRect(849, 389, 100, 50); // 4
			g.drawString("$25,000", 849, 439);
			

			g.drawRect(849, 339, 100, 50); // 5
			g.drawString("$50,000", 849, 389);
			
			g.drawRect(849, 289, 100, 50); // 6
			g.drawString("$100,000", 849, 339);
			
			
			g.drawRect(849, 239, 100, 50); // 7
			g.drawString("$150,000", 849, 289);
			
			
			g.drawRect(849, 189, 100, 50); // 8
			g.drawString("$250,000", 849, 239);
			
			
			g.drawRect(849, 139, 100, 50); // 9
			g.drawString("$500,000", 849, 189);
			
			
			g.drawRect(849, 89, 100, 50); // 10
			g.drawString("$1,000,000", 849, 139);
			
			
			
			/*
			g.drawRect(849, 39, 100, 50); // 11
			g.drawString("$1000", 849, 539);

*/ 


		
			
			//g.drawRect(244, 230, 483, 200);
		}
		
	};
	 
	
	private JButton g1 = new JButton("A"); 
	private JButton help = new JButton();

	
	private JButton a = new JButton("A"); 
	
	
	private JButton b1 = new JButton("A");
	private JButton b2 = new JButton("B");

	private JButton b3 = new JButton("C");
	private JButton b4 = new JButton("D");
	
//	private JTextArea textArea = new JTextArea();
//	private JTextField textField = new JTextField();
	private JButton submit = new JButton ("Split");
	
	
	//Listeners************************************
	//NONE ADDED YET
	
	//Game Variable********************************
	//NO GAME TO SPEAK OF YET
	
	
	//Construtors:
	
	

	
	
	
	
	Font GameFont= new Font("Arial", Font.BOLD, 30);

	
	public Millionaire() {
		//sets frame location
		
		frame.setLocation(100, 100);
		
		
		a.setLocation(922, 300);
		frame.add(a);
		
		//SetLayoutManager
		
		
		
		
		//frame.setLayout(new GridBagLayout());
		
		//CODE TO ADD PANEL
		//special object that gives the GUI manager
		//instructions on how to add an object
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0;
		c1.gridy = 0;
		c1.gridwidth = 2;
		panelMain.setPreferredSize(new Dimension(950,590));
		
		frame.add(panelMain,c1);
		
		
		/* 
		
		//CODE TO ADD BUTTON 1
		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 0;
		c2.gridy = 1;
		
		
		frame.add(b1,c2);
		
		//CODE TO ADD BUTTON 2
		GridBagConstraints c3 = new GridBagConstraints();
		c3.gridx = 1;
		c3.gridy = 1;
		c3.anchor = GridBagConstraints.CENTER;
		c3.weightx = 50;
		frame.add(b2,c3);

		//CODE TO ADD BUTTON 3
		GridBagConstraints c4 = new GridBagConstraints();
		c4.gridx = 0;
		c4.gridy = 2;
		
		frame.add(b3,c4);
		
		//CODE TO ADD BUTTON 4
		GridBagConstraints c5 = new GridBagConstraints();
		c5.gridx = 1;
		c5.gridy = 2;
		c5.anchor = GridBagConstraints.CENTER;
	
		frame.add(b4,c5);

		
		
		//CODE TO ADD SUBMIT BUTTON
		GridBagConstraints c7 = new GridBagConstraints();
		c7.gridx = 2;
		c7.gridy = 2;
		c7.gridwidth = 2;
		c7.fill = GridBagConstraints.BOTH;
		
		frame.add(submit, c7);
		
		
		*/  
	
		
		
	
		//FINALIZE FRAME SETUP
		//frame.setResizable(false);
		//frame.pack(); //packs all the elements so it sets the size of the screen automatically
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
		/* 
		//CODE TO ADD TEXT AREA
		GridBagConstraints c6 = new GridBagConstraints();
		c6.gridx = 2;
		c6.gridy = 0;
		c6.anchor = GridBagConstraints.NORTH;
		c6.fill = GridBagConstraints.BOTH;
		
		textArea.setRows(30);
		textArea.setColumns(30);
			
		frame.add(textArea,c6);
		
		*/ 
		
	/* 
		
		//CODE TO ADD TEXTFIELD
		GridBagConstraints c8 = new GridBagConstraints();
		c8.gridx = 2;
		c8.gridy = 1;
		c8.gridwidth = 2;
		c8.fill = GridBagConstraints.BOTH;
	
		frame.add(textField, c8);
		
		*/ 
		
		
	} 
		
		
	
	
	
	
	public static void main(String[] args) {
		
		
		Millionaire game = new Millionaire();
		
		
	}; 
	
	 
} 
	
	
	
	



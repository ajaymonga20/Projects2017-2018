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
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Millionaire_GUI {

	//Fields
	//GUI******************************************
	private JFrame frame = new JFrame("Game_NI");
	
	private JPanel panelMain = new JPanel() {
		
		public void paint(Graphics g) {
			
			Graphics2D g2 = (Graphics2D)g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2.setColor(Color.LIGHT_GRAY);
			g2.fillRect(100, 5, 295, 40);
			g2.fillRect(100, 50, 200, 100);
			g2.fillRect(305, 50, 90, 35);
			g2.fillRect(305, 90, 90, 35);
			g2.fillRect(305, 130, 90, 20);
			
			g2.fillRect(100, 155, 100, 50);
			g2.fillRect(205, 155, 100, 50);
			// g2.fillRect(x, y, width, height);
			g2.setColor(Color.BLACK);
			g2.setFont(new Font("Arial", Font.BOLD, 36));
			g2.drawString("Wheel of Fortune", 100, 35);
		//	g2.drawString("Guesses Used:" +g, , y);
			//g2.drawString("Guesses Left:", x, y);
			//g2.drawString(str, x, y);


		} 
			

			
			
			};
			
			
			
		; 

	

	private JButton b1 = new JButton("A");
	private JButton b2 = new JButton("B");

	private JButton b3 = new JButton("C");
	private JButton b4 = new JButton("D");
	
	private JTextArea textArea = new JTextArea("");
	private JTextField textField = new JTextField("");
	private JButton submit = new JButton ("submit");
	
	
	//Listeners************************************
	//NONE ADDED YET
	
	//Game Variable********************************
	//NO GAME TO SPEAK OF YET
	
	
	//Construtors:
	
	
	public Millionaire() {
		//sets frame location
		frame.setLocation(100, 100);
		
		//SetLayoutManager
		frame.setLayout(new GridBagLayout());
		
		//CODE TO ADD PANEL
		//special object that gives the GUI manager
		//instructions on how to add an object
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0;
		c1.gridy = 0;
		c1.gridwidth = 2;
		panelMain.setPreferredSize(new Dimension(500,500));
		
		frame.add(panelMain,c1);
		
		//CODE TO ADD BUTTON 1
		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 0;
		c2.gridy = 1;
		c2.weightx = 50;
		
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
		c4.weightx = 1.0;
		
		frame.add(b3,c4);
		
		//CODE TO ADD BUTTON 4
		GridBagConstraints c5 = new GridBagConstraints();
		c5.gridx = 1;
		c5.gridy = 2;
		c5.anchor = GridBagConstraints.CENTER;
		c5.weightx = 1.0;
		frame.add(b4,c5);

		
		//CODE TO ADD TEXT AREA
		GridBagConstraints c6 = new GridBagConstraints();
		c6.gridx = 2;
		c6.gridy = 0;
		c6.anchor = GridBagConstraints.NORTH;
		c6.fill = GridBagConstraints.BOTH;
		
		textArea.setRows(30);
		textArea.setColumns(30);
			
		frame.add(textArea,c6);
		
	
	
		//CODE TO ADD SUBMIT BUTTON
		GridBagConstraints c7 = new GridBagConstraints();
		c7.gridx = 2;
		c7.gridy = 2;
		c7.gridwidth = 2;
		c7.fill = GridBagConstraints.BOTH;
		
		frame.add(submit, c7);
		
		//CODE TO ADD TEXTFIELD
		GridBagConstraints c8 = new GridBagConstraints();
		c8.gridx = 2;
		c8.gridy = 1;
		c8.gridwidth = 2;
		c8.fill = GridBagConstraints.BOTH;
	
		frame.add(textField, c8);
		
	
		//FINALIZE FRAME SETUP
		frame.setResizable(false);
		frame.pack(); //packs all the elements so it sets the size of the screen automatically
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	} 
		
		
	
	
	
	
	public static void main(String[] args) {
		
		
		Game2_NI game = new Game2_NI();
		
		
	}; 
	
} 
	 
	
	
	
	



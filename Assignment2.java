// Imports 

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Assignment2 {

	
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
			
			g.setFont(new Font("Arial", Font.BOLD, 27));
			g.drawString("Who Wants To Be A Millionaire", 300, 35);
			
			g.setColor(Color.ORANGE);

			g.setFont(new Font("Arial", Font.BOLD, 18));			
			g.drawRect(800, 489, 100, 50); // 1
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
			
			g.setFont(new Font("Arial", Font.BOLD, 42));
			g.drawOval(80, 225, 165, 165);
			g.drawString("15000", 102, 320);

			
			g.setFont(new Font("Arial", Font.BOLD, 34));
			g.drawString("TIME REMAINING", 370, 140);
			
			
			g.drawOval(400, 180, 165, 165);
			g.setFont(new Font("Arial", Font.BOLD, 69));
			g.drawString(":29", 430, 290);
			
			
			
			

			
			

		}
	};
	
	private JButton button1 = new JButton("A) Skopje");
	private JButton button2 = new JButton("B) Minsk");
	private JButton button3 = new JButton("C) Talinn");
	private JButton button4 = new JButton("D) Sarajevo");
	
	
	
	private JTextArea textArea = new JTextArea("What is the capital of Macedonia?");

	
	
	
	
	
	public Assignment2() {
		
		
		
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
		
		
		frame.add(button1, c2);
		
		GridBagConstraints c3 = new GridBagConstraints(); 
		
		c3.gridx = 1; 
		c3.gridy = 2; 
		
		
		frame.add(button2, c3);
		
		GridBagConstraints c4 = new GridBagConstraints(); 
		
		c4.gridx = 0; 
		c4.gridy = 3; 
				
		
		

		
		
		frame.add(button3, c4);
		
		
		GridBagConstraints c5 = new GridBagConstraints(); 
		
		c5.gridx = 1; 
		c5.gridy = 3; 
		
		
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
		
		

		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment2 game = new Assignment2();
	}

}

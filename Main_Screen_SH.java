import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class Main_Screen_SH {

	//Fields - Attributes
	//GUI
	private JFrame frame = new JFrame("Quiz of the Day");
	private JPanel panel = new JPanel() {
		
		public void paint(Graphics g) {
			
			g.fillRect(0, 0, 1000,1000);
			g.setColor(Color.BLUE);
			g.fillOval(200, 15, 100, 50);
			g.setColor(Color.RED);
			g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
			g.drawString(""+countDown,240,50);
			
			//g.drawLine(0, 0, 50, 50);
			
		}
		
		
	}; //what does this do?
	
	private JTextArea questions = new JTextArea("Question: ");
	private JButton trueButton = new JButton("TRUE");
	private JButton falseButton = new JButton("FALSE");
	//**************************
	
	private ActionListener timerAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Timer Running");
			countDown = countDown - 1;
			if (countDown == 0) {
				t.stop();
				trueButton.setEnabled(false);
			}
			panel.repaint();
		}
		
		
	};
	
	private Timer t = new Timer(1000,timerAction);
	
	
	//***************************
	//Listeners
	
	
	//Game Fields
	
	private int countDown = 10;
	private Player player;
	
	//Constructor
	public Main_Screen_SH(Player p) {
		
		player = p;
		/*
		 * For the below code:
		 * 		frame is the implied object.
		 * 		frame is calling the set location method which is an instance method
		 */
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new GridBagLayout());
		
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0;
		c1.gridy = 0;
		c1.gridwidth = 2;
		
		panel.setBackground(Color.WHITE);// why doesn't this work? also, why can't I center the buttons? 
		panel.setPreferredSize(new Dimension (500, 80));
		
		frame.add(panel,c1);
		
		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 0;
		c2.gridy = 1;
		c2.gridwidth = 2;
		
		questions.setColumns(25);
		questions.setRows(20);
		questions.setBackground(Color.PINK);
		questions.setFont(questions.getFont().deriveFont(18.0f));
	
		frame.add(questions, c2);
		
		GridBagConstraints c3 = new GridBagConstraints();
		
		c3.gridx = 0;
		c3.gridy = 2;
		c3.gridwidth = 1;
		c3.anchor = GridBagConstraints.CENTER;
		
		trueButton.setPreferredSize(new Dimension(100,100));
		trueButton.setBackground(Color.GREEN);
		
		frame.add(trueButton, c3);
		
		
		GridBagConstraints c4 = new GridBagConstraints();
		
		c4.gridx = 1;
		c4.gridy = 2;
		c4.gridwidth = 1;
		c4.anchor = GridBagConstraints.CENTER;
		
		
		falseButton.setPreferredSize(new Dimension(100,100));
		falseButton.setBackground(Color.RED);
		
		frame.add(falseButton, c4);
		
		frame.pack(); //looks at everything on the frame and sets the frame size that is best. 
		frame.setVisible(true);
		
		t.start();
		
	}
	
	//Methods - Behaviours 
	
	
	
}
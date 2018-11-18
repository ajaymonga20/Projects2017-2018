import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class AW {

	//Fields
	//GUI******************************************
	private JFrame frame = new JFrame("Game_NI");
	
	private JPanel panelMain = new JPanel() {
		
		public void paint(Graphics g) {
			
			for (int i = 0; i < balls.size(); i = i + 1) {
				g.fillOval(balls.get(i).getX(), balls.get(i).getY(), balls.get(i).getR(), balls.get(i).getR());
			}
			
		}

	};

	private JButton b1 = new JButton("Button 1");
	private JButton b2 = new JButton("Button 2");

	private JButton b3 = new JButton("Button 3");
	private JButton b4 = new JButton("Button 4");
	
	private JTextArea textArea = new JTextArea();
	private JTextField textField = new JTextField();
	private JButton submit = new JButton ("submit");
	
	//Timers***************************************
	Timer t;
	
	//Listeners************************************
	
	public ActionListener al = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
		
			for (int i = 0; i < balls.size(); i = i + 1) {
				balls.get(i).changeX(-1);
			}
			panelMain.repaint();
		}
		
	};
	public MouseListener ml = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getX()+":"+e.getY());
			balls.add(new Ball(e.getX(),e.getY()));
			panelMain.repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	};
	//Game Variable********************************
	ArrayList<Ball> balls = new ArrayList<Ball>();
	
	//Construtors:
	public Game2_AW() {
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
		panelMain.addMouseListener(ml);
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
		
		//SetupTimer and start it. 
		t = new Timer(50,al);
		t.start();
		
		//FINALIZE FRAME SETUP
		frame.setResizable(false);
		frame.pack(); //packs all the elements so it sets the size of the screen automatically
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		
		
		Game2_AW game = new Game2_AW();
		
		
	}

	
	
}

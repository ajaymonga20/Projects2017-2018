import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicBall {
//Attributes


private JFrame frame = new JFrame("Basic Ball A");
private JPanel panel = new JPanel() {
public void paint(Graphics g) {

Graphics2D g2 = (Graphics2D)g;
g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);





System.out.println(panel.getWidth());
System.out.println(panel.getHeight());
int width = panel.getWidth();
int height = panel.getHeight();

g2.draw3DRect(10, 10, width, height, true);


//g2.setColor(Color.RED);

//g2.drawLine(0, 0, 500, 0);




//g2.drawLine(0, 0, 0, 500);




//g2.drawLine(500, 0, 0, 500);




//g2.drawLine(0, 500, 500, 0);



}

 

};


public BasicBall() {
//Constructors



frame.setSize(500,500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel);


frame.setVisible(true);
}

//Behaviours - Methods


public static void main(String[] args) {
BasicBall game = new BasicBall();




}

}
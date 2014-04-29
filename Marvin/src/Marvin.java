import java.awt.*;
import javax.swing.*;

public class Marvin extends JApplet
{
	private double product, sum;
	int x = 0;
		public void init()
		{				
		
		}
	
	
		public void paint(Graphics g)
		{
			while(x < 1)
			{
			String fn = JOptionPane.showInputDialog("Enter First Number");
			String sn = JOptionPane.showInputDialog("Enter Second Number");

			double n1 = Double.parseDouble(fn);
			double n2 = Double.parseDouble(sn);
		
			product = n1 * n2;
			sum = n1 + n2;
			
			super.paint(g);
			g.drawString("The product of " + n1 + " and "  +n2+ " is " + product, 0, 30);
			g.drawString("The sum of "+ n1 + " and " + n2 + " is " + sum, 0, 60);
			x++;
			}
		}
		
	
}
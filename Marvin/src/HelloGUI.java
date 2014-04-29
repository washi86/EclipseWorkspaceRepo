import javax.swing.JOptionPane;

public class HelloGUI
{

	public static void main(String[] args)
	{
		int num1 = 0;
		
		String num = JOptionPane.showInputDialog("Enter a number please????? ");
		
		try
		{
		 num1 = Integer.parseInt(num);
		 
		 if (num1 == 5)
			{
				JOptionPane.showMessageDialog(null, "You chose the correct integer");
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "You chose the wrong integer");
			}
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("You didn't input an Integer");
		}
		

	}

}

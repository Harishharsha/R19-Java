package Unit5;

//Java program to show ERROR_MESSAGE dialog 
//in Java. Importing different Package. 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

class Demo extends JFrame implements ActionListener 
{ 
	// Declaration of object of JButton class. 
	JButton b1; 
	JFrame jf;
	// Constructor of Demo class 
	Demo() 
	{ 
		jf=new JFrame("Dialogs");
		// Setting layout as null of JFrame. 
		jf.setSize(500,500);
		jf.setLayout(new FlowLayout()); 
		
		// Initialization of object of "JButton" class. 
		b1 = new JButton("Button 1"); 
		
		 
		jf.add(b1); 
		
		// Adding Listener toJButton. 
		b1.addActionListener(this); 
		jf.setVisible(true);
		
	} 

	// Override Method 
	public void actionPerformed(ActionEvent evt) 
	{ 
		Object[] msg= {"hi this is Message"};
		Object[] alert= {"Enter name"};
		if (evt.getSource() == b1) 
		{ 
			// Code To popup an ERROR_MESSAGE Dialog. 
			//JOptionPane.showMessageDialog(this, "Enter a valid Number","ERROR", JOptionPane.ERROR_MESSAGE); 
			
			 //JOptionPane.showMessageDialog(this, "Enter a valid String", "WARNING",JOptionPane.WARNING_MESSAGE);
			 		
			//JOptionPane.showMessageDialog(this, "Do you want to quit","Question", JOptionPane.QUESTION_MESSAGE);
			
			//JOptionPane.showMessageDialog(this, "You Pressed Button FOUR", "INFORMATION",  JOptionPane.INFORMATION_MESSAGE);
			
			//JOptionPane.showConfirmDialog(this,msg, "Click ok or Cancel",JOptionPane.OK_CANCEL_OPTION);
			
			JOptionPane.showInputDialog(alert, JOptionPane.showInputDialog(getParent(), getTitle()));
			
			
		} 
	} 
} 

class MessageDialogs1 { 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
		 
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Demo();
			}
		}); 
		
	} 
} 

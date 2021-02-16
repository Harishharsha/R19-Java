package Unit5;

import javax.swing.*;
/*
<applet code="ImageIconEx" width=250 height=200>
</applet>
*/
public class ImageIconEx extends JApplet {
	public void init() {
		setSize(500,500);
	try {
	SwingUtilities.invokeLater(	new Runnable() {
	public void run() {
	
	makeGUI();
	}
	}	);
	}catch (Exception exc) {
	System.out.println("Can't create because of " + exc);
	}
	}
	private void makeGUI() {
	// Create an icon.
	ImageIcon ii = new ImageIcon("C:\\Users\\haris\\OneDrive\\Desktop\\hourglass.jpg");
	// Create a label.
	
	JLabel jl = new JLabel("Hourglass", ii, JLabel.CENTER);
	// Add the label to the content pane.
	
	add(jl);
	}
	
	}
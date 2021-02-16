package Unit5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JTextFieldEx extends JApplet implements ActionListener{
	JTextField tf;
	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					makeGUI();
				}
			});
		}
		catch(Exception e) {System.out.println(e);}
	}
	public void makeGUI() {
		setLayout(new FlowLayout());
		tf=new JTextField(15);
		add(tf);
		tf.setText("Mahesh");
		tf.addActionListener(this);
		/*
		 * tf.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) {
		 * showStatus(tf.getText());
		 * }
		 * 
		 * 
		 * });
		 */
		
	}
	public void actionPerformed(ActionEvent e) {
		showStatus(tf.getText());
	}
}

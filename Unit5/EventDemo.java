package Unit5;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class EventDemo {
	EventDemo(){
		JFrame jfrm=new JFrame("Hi this Java Frame");
		jfrm.setSize(100,500);
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jlab=new JLabel("Sample Label");
		JButton jbtn1=new JButton("Alpha");
		JButton jbtn2=new JButton("Beta");
		
		
		jbtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jlab.setText("Alpha Pressed");
				
			}
		});
		jbtn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jlab.setText("Beta Pressed");
				
			}
		});
		jfrm.add(jlab);
		jfrm.add(jbtn1);
		jfrm.add(jbtn2);
		jfrm.setVisible(true);
	}

public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {

		public void run() {
			new EventDemo();
		}
	});
}
}

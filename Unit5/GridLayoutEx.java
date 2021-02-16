package Unit5;
import java.awt.GridLayout;

import javax.swing.*;
public class GridLayoutEx {
	GridLayoutEx(){
		JFrame o=new JFrame("new JFrame");
		o.setSize(500,500);
		o.setLayout(new GridLayout(4,3));
		JButton b1=new JButton("0");
		JButton b2=new JButton("1");
		JButton b3=new JButton("2");
		JButton b4=new JButton("3");
		JButton b5=new JButton("4");
		JButton b6=new JButton("5");
		JButton b7=new JButton("6");
		JButton b8=new JButton("7");
		JButton b9=new JButton("8");
		JButton b10=new JButton("9");
		o.add(b1);
		o.add(b2);
		o.add(b3);
		o.add(b4);
		o.add(b5);
		o.add(b6);
		o.add(b7);
		o.add(b8);
		o.add(b9);
		o.add(b10);
		o.setVisible(true);
	}
public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {

		@Override
		public void run() {
			new GridLayoutEx();
			
		}
		
	});
}
}

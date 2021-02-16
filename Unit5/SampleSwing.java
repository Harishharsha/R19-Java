package Unit5;
import javax.swing.*;
public class SampleSwing {
	SampleSwing(){
		JFrame o=new JFrame("HI Students");
		o.setSize(500,500);
		o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label=new JLabel("I am Label");
		o.add(label);
		o.setVisible(true);
	}
public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			new SampleSwing();
		}
	});
}
}

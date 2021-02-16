package Unit5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="JComboBoxDemo" width=300 height=200>
</applet>
*/

public class JComboBoxDemo extends JApplet {
JLabel jlab;
ImageIcon hourglass, analog, digital, stopwatch;
JComboBox<String> jcb;
String timepieces[] = { "Hourglass", "Analog", "Digital", "Stopwatch" };
public void init() {
try {
SwingUtilities.invokeAndWait(
new Runnable() {
public void run() {
makeGUI();
}
}
);
} catch (Exception exc) {
System.out.println("Can't create because of " + exc);
}
}
private void makeGUI() {
// Change to flow layout.
setLayout(new FlowLayout());
// Instantiate a combo box and add it to the content pane.
jcb = new JComboBox<String>(timepieces);
add(jcb);
// Handle selections.
jcb.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
String s = (String) jcb.getSelectedItem();
jlab.setIcon(new ImageIcon("C:\\Users\\haris\\OneDrive\\Desktop\\"+s + ".jpg"));
}
});
// Create a label and add it to the content pane.
jlab = new JLabel(new ImageIcon("C:\\\\Users\\\\haris\\\\OneDrive\\\\Desktop\\\\hourglass.png"));
add(jlab);
}
}
package Unit5;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AppletStatus extends Applet{
	public void init() {
		setBackground(Color.CYAN);
	}
	public void paint(Graphics g) {
		g.drawString("Hi Students",50,50);
		showStatus("This is status window");
	}
}

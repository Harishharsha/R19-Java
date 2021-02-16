package Unit5;

import java.applet.Applet;
import java.awt.Graphics;

public class AppletSkeletonEx extends Applet{
	public void init() {
		//Init is starting method in Applet LifeCycle
	}
	public void start()
	{
		//Starts when it maximizes
	}
	public void stop() {
		//Starts when it minimizes
	}
	public void paint(Graphics g) {
		g.drawString("Hi I am painted in paint Method", 100,100);
	}
	public void destroy() {
		//Starts when it kills
	}

}

import java.awt.*;
import java.applet.Applet;

public class Program1 extends Applet {
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.drawOval(100,150,200,200);
		g.drawRect(100,150,200,200);
		g.drawLine(100,150,300,350);
	}
}

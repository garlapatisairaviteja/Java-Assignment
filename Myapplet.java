import java.awt.*;
import java.applet.*;
public class Myapplet extends Applet
{
	public void init()
	{
		setBackground(Color.blue);
		setForeground(Color.white);
	}
	public void paint(Graphics g)
	{
		g.drawString("Ravi Teja",100,100);
	}
}
/*
<applet code="Myapplet.class" width=300 Height =200>
</applet>
*/

	
		
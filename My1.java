import java.awt.*;
import java.applet.*;
public class My1 extends Applet
{
	String str="This is RaviTeja from CSE";
	public void init()
	{
		setSize(400,150);
	}
	public void paint(Graphics g)
	{
		g.drawString(str,20,50);
	}
}
/*
<applet code="My1.class" width=300 Height =200>
</applet>
*/

	
		
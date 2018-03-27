import java.awt.*;
import java.applet.*;
public class My2 extends Applet
{
	String str1,str2,str3;
	public void init()
	{
		setSize(400,150);
		setBackground(Color.white);
		str1="I am Ravi Teja";
		str2="Welcomes you for Applet Programming";
		str3="Thank you";
		
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawString(str1,10,10);
		g.setColor(Color.blue);
		g.drawString(str2,50,50);
		g.setColor(Color.yellow);
		g.drawString(str3,70,70);
	}
}
/*
<applet code="Myapplet.class" width=300 Height =200>
</applet>
*/

	
		
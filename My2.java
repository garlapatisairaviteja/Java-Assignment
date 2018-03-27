import java.awt.*;
import java.applet.*;
public class My2 extends Applet
{
	String str1,str2,str3;
	public void init()
	{
		setBackground(Color.white);
		str1="I am Ravi Teja";
		str2="Welcomes you for Applet Programming";
		str3="Thank you";
		
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawString(str1,50,30);
		g.setColor(Color.blue);
		g.drawString(str2,50,50);
		g.setColor(Color.yellow);
		g.drawString(str3,50,70);
	}
}
/*
<applet code="My2.class" width=500 Height =500>
</applet>
*/

	
		
import java.awt.*;
import java.applet.*;
public class Poly extends Applet
{
	int x []={20,70,170,220,170,70,20};
	int y []={100,13,13,100,186,186,100};
	int n=6;
	public void init()
	{
		setSize(500,200);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.orange);
		g.fillPolygon(x,y,n);
	}
}
/*
<applet code="Poly.class" width=300 Height =200>
</applet>
*/

	
		
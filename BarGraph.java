import java.awt.*;
import java.applet.*;
public class BarGraph extends Applet
{
 public void paint(Graphics g)
{
  int a[]={30,90,60,50,20,80,90};
  g.drawLine(10,40,10,160);
  g.drawLine(10,160,200,160);
  for(int i=0;i<7;i++)
{
g.fillRect((20+i*20),(160-a[i]),15,a[i]);
}
g.drawString("bar graph of 7 months",10,180);
}
}

/*
<Applet code="BarGraph.class" width=300 height=200>
</Applet>
*/

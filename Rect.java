import java.applet.*;
import java.awt.*;
public class Rect extends Applet
{

public void paint(Graphics g)
{
 g.setColor(Color.red);
 g.fillRect(120,50,140,50);
 g.setColor(Color.blue);
 g.drawRect(420,450,440,450);
}
}

/*<Applet code = "Rect.class" width=600 Height=600>
</Applet>
*/




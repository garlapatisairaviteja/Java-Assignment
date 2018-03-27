import java.awt.*;
import javax.swing.*;
public class MyGridLayout
{
	JFrame f;
	MyGridLayout()
	{
		f=new JFrame();
		JButton b1=new JButton("B1");
		JButton b2=new JButton("B2");
		JButton b3=new JButton("B3");
		JButton b4=new JButton("B4"); 
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
        f.setLayout(new GridLayout(2,2));
		//setting grid layout of 2 rows and 2 columns 
		f.setSize(300,300); 
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new MyGridLayout();
	}
}  
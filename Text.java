import java.awt.*;
class Text extends Frame
{
	TextField t1,t2,t3;
	Button b1,b2;
	Label l1,l2,l3,l4,l5;
	Checkbox c1,c2;
	public static void main(String a[])
	{
		Text b=new Text();
	}
	public Text()
	{
		super("awt window with buttons");
		setLayout(new FlowLayout());
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		b1=new Button("login");
		l1=new Label("Std name");
		l2=new Label("Roll no:");
		l3=new Label("Class");
		l4=new Label("Hindi");
		l5=new Label("English");
		c1=new Checkbox();
		c2=new Checkbox();
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(c1);
		add(l5);
		add(c2);
		add(b1);
		setSize(790,200);
		setVisible(true);
	}
}

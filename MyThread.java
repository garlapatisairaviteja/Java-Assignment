import  java.lang.*;
class MyThread extends Thread
{
public MyThread()
{
	for(int i=1;i<=4;i++)
	{
		System.out.println("the square root of "+i+"is "+Math.sqrt(i));
	}
	Thread t1=new Thread();
	t1.start();
	for(int i=5;i<8;i++)
	{
		System.out.println("the square root of "+i+"is "+Math.sqrt(i));
	}
	Thread t2=new Thread();
	t2.start();
	}
	public void run()
	{
		for(int j=9;j<=12;j++)
		{
			System.out.println("the square root of"+j+" is " +Math.sqrt(j));
		}
	}
}
class TestThread
{
	public static void main(String a[])
	{
		MyThread m=new MyThread();
		m.start();
	}
}

class ThDemo extends Thread
{
	@Override
	public void run()
	{
	  System.out.println("I am Thread..");
	}
}

public class Demo
{
	public static void main(String[] args)
	{
		ThDemo ob=new ThDemo();
		ob.start();
	}
}
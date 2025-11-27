class Demo1 implements Runnable
{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Value-"+i);
		}
	}
}
public class RunDemo
{
	public static void main(String[] args)
	{
	 Demo1 ob=new Demo1();
	 Thread th=new Thread(ob);
	 th.start();
	}

}

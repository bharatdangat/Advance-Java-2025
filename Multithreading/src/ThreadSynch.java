public class ThreadSynch extends Thread
{
	static synchronized void display()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
	@Override
	public void run() {
	display();
	}
	public static void main(String[] args)
	{
	 Thread th1=new Thread();
	 Thread th2=new Thread();
	 Thread th3=new Thread();
	 th1.start();
	 th2.start();
	 th3.start();
	}

}

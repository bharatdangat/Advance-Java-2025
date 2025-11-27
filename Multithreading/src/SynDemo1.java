//Thread Synchronization-One By One Execution of Thread...
class Aa implements Runnable
	{
		@Override
		synchronized public void run() {
		for(int i=0;i<3;i++)
		{
			System.out.println("A of i-"+i);
		}
		}
	}
	class Bb implements Runnable
	{
		@Override
		synchronized public void run() {
			for(int i=0;i<3;i++)
			{
				System.out.println("B of i-"+i);
			}
			
		}
	}
	class Cc implements Runnable
	{
		@Override
		synchronized public void run() {
			for(int i=0;i<3;i++)
			{
				System.out.println("B of i-"+i);
			}
			
		}
	}
public class SynDemo1 
{
	public static void main(String[] args)
	{
	 Aa ob1=new Aa();
	 Bb ob2=new Bb();
	 Cc ob3=new Cc();
	 Thread th1=new Thread(ob1);
	 Thread th2=new Thread(ob2);
	 Thread th3=new Thread(ob3);
	 
	 th1.start();
	 th2.start();
	 th3.start();
	 
	}

}

//Synchronized Block-
class AClass implements Runnable
	{
		@Override
		 public void run() {
		for(int i=0;i<3;i++)
		{
			System.out.println("A of i-"+i);
		}
		}
	}
	class BClass implements Runnable
	{
		
		@Override
		 public void run() {
			for(int i=0;i<3;i++)
			{
				System.out.println("B of i-"+i);
			}
			
		}
	}
	class CClass implements Runnable
	{
	
		@Override
		 public void run() {
			for(int i=0;i<3;i++)
			{
				System.out.println("B of i-"+i);
			}
			
		}
	}
public class SynDemo2
{
	public static void main(String[] args)
	{
	 AClass ob1=new AClass();
	 BClass ob2=new BClass();
	 CClass ob3=new CClass();
	 Thread th1=new Thread(ob1);
	 Thread th2=new Thread(ob2);
	 Thread th3=new Thread(ob3);
	 
	 th1.start();
	 th2.start();
	 th3.start();
	 
	}

}

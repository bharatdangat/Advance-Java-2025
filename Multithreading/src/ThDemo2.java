class Demo2 extends Thread
{
	@Override
	public void run()
	{
	  try
	  {
		  for(int i=100;i>=1;i--)
		  {
			  System.out.println(i);
			  sleep(2000);
		  }
	  }catch(Exception e){}
	}
}
public class ThDemo2 
{
	public static void main(String[] args)
	{
	 Demo2 th=new Demo2();
	 th.start();
	}

}

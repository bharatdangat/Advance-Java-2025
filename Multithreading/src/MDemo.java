
public class MDemo
{
	public static void main(String[] args)
	{
	 Thread th=Thread.currentThread();
	 System.out.println(th);
	 th.setName("RBNB");
	 System.out.println(th);
	 System.out.println(th.getName());
	}

}

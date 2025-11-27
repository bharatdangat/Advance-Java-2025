//Multithreading-multiple Thereads execute concurrently...
class A extends Thread
{
	@Override
	public void run()
	{
	 for(int i=0;i<=3;i++)
	 {
		 System.out.println("A of i="+i);
	 }
	}
}
class B extends Thread
{
	@Override
	public void run() 
	{
		for(int i=0;i<=3;i++)
		 {
			System.out.println("B of i="+i); 
		 }
		
	}
}
class C extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=3;i++)
		 {
			System.out.println("C of i="+i); 
		 }
		
	}
}
public class MultiDemo
{
	public static void main(String[] args)
	{
	 A ob1=new A();
	 B ob2=new B();
	 C ob3=new C();
	
	 ob1.start();
	 ob2.start();
	 ob3.start();
	}

}

class AC implements Runnable 
{
  @Override
public void run() {
	// TODO Auto-generated method stub
   System.out.println("I am Thread A-"+Thread.currentThread().getName());	
}
}
class BC implements Runnable
{
  @Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("I am Thread B-"+Thread.currentThread().getName());
}	
}
public class ThPriority
{
	public static void main(String[] args)
	{
     AC ob1=new AC();
     Thread th1=new Thread();
     th1.start();
     th1.setPriority(Thread.MAX_PRIORITY);
     System.out.println("A Priority-"+th1.getPriority());
     BC ob2=new BC();
     Thread th2=new Thread();
     th2.start();
     th2.setPriority(5);
     System.out.println("B Priority-"+th2.getPriority());
	}

}

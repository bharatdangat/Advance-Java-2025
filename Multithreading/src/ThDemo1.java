import java.util.*;
class RandomAZ extends Thread
{
	@Override
	public void run()
	{
	Random r1=new Random();
	for(int i=1;i<=100;i++)
	{
		try
		{
		sleep(2000);
		}catch(Exception e){}
	  int n=r1.nextInt(100);
	  System.out.println(n);
	}
	}
}
public class ThDemo1 {

	public static void main(String[] args) {
    RandomAZ ob=new RandomAZ();
    ob.start();
	}

}

class SignalColor extends Thread
{
	int time;
	String color;
	public SignalColor(String color,int time)
	{
	 this.color=color;
	 this.time=time;
	}
 @Override
public void run()
 {
	 try
	 {
       sleep(time);
       System.out.println(color);
	 }catch(Exception e){}
 }	
}
public class MSignal 
{
	public static void main(String[] args)
	{
	 SignalColor t1=new SignalColor("Red",1000);
	 SignalColor t2=new SignalColor("Yellow",2000);
	 SignalColor t3=new SignalColor("Green",3000);
	 t1.start();
	 t2.start();
	 t3.start();
	}

}

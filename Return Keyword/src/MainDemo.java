import java.util.ArrayList;

public class MainDemo
{
	public static void main(String[] args)
	{
  CreateCricketer cc=new CreateCricketer();
  ArrayList<Cricketers> a=cc.getcricketerInfo();
  for(Cricketers s:a)
  {
	  System.out.println("Cricketer name-"+s.getName());
	  System.out.println("Cricketer jersy No-"+s.getJersyno());
	  
  }
	}
  }

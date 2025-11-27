import java.util.ArrayList;

public class Controller1 
{
  public ArrayList<Cricketers> fetchData()
  {
	  Service1 s1=new Service1();
	  ArrayList<Cricketers> a=s1.fetchData();
	  return a;
  }
}

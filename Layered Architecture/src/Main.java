import java.util.ArrayList;

public class Main
{
 public static void main(String[] args)
 {
  Controller1 c=new Controller1();
  ArrayList<Cricketers> a=c.fetchData();
  for(Cricketers s:a)
  {
	  System.out.println("Cicketer Jersy No-"+s.getJersyno());
	  System.out.println("Cricketer Name-"+s.getName());
	  System.out.println("############################");
  }
 }
}

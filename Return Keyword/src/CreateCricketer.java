import java.util.ArrayList;
public class CreateCricketer 
{
  ArrayList<Cricketers> getcricketerInfo()
  {
	  ArrayList<Cricketers> a1=new ArrayList<>();
	  Cricketers c1=new Cricketers("Virat",7);
	  Cricketers c2=new Cricketers("Dhoni",13);
	  Cricketers c3=new Cricketers("Sachin",34);
	  a1.add(c1);
	  a1.add(c2);
	  a1.add(c3);
      return a1;
  }
}

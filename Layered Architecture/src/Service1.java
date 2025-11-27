import java.util.ArrayList;

public class Service1 
{
  public ArrayList<Cricketers>  fetchData()
  {
	  Dao1 d=new Dao1();
	  ArrayList<Cricketers> a=d.databaseCode();
	  return a;
  }
  
//  ArrayList<Cricketers> filterd =new ArrayList<>();
//  for(Cricketers cc:a)
//  {
//	  if(cc.getName().startsWith("V"))
//	  {
//		  filterd.add(cc);
//	  }
//  }
//  return filterd;

}

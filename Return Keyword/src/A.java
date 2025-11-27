//Return classs...
public class A 
{
	Cricketer getInfo()
	{
	 Cricketer c=new Cricketer(19,"Virat");
	 //c.age=19;
	 //c.name="Virat";
	 return c;
	}
	
	public static void main(String[] args)
	{
		A ob=new A();
		Cricketer c=ob.getInfo();
		
		//System.out.println("Cricketer age-"+c.age);
		//System.out.println("Cricketer name-"+c.name);
		System.out.println(c);
	}
}

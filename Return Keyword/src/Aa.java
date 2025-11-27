//call getInfo() method of class B without creating object of B...
public class Aa
{
	B getMessage(C c)
	{
		return new B();
	}
	public static void main(String[] args)
	{
	 Aa ob=new Aa();
	 B b=ob.getMessage(new C());
	 String s=b.getInfo();
	 System.out.println(s);
	 //String s=new Aa().getMessage(new C());.getInfo();
	}

}

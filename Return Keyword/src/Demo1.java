//Returning Array of String...
public class Demo1
{
	String[] getNames()
	{
	  String a[]=new String[5];
	  a[0]="om";
	  a[1]="sai";
	  a[2]="ram";
	  a[3]="sham";
	  a[4]="aman";
	  return a;
	}
	public static void main(String[] args)
	{
	Demo1 ob=new Demo1();
	String a[]=ob.getNames();
	for(String name:a)
	{
		System.out.println(name);
	}
	}

}

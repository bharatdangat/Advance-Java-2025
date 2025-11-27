import java.util.*;
class VDemo extends Thread
{
	@Override
	public void run()
	{
	 try
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter String-");
		 String s1=sc.next();
		 for(int i=0;i<s1.length();i++)
		 {
			 char ch=s1.charAt(i);
			 if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			 {
				 sleep(2000);
				 System.out.println(ch);
			 }
		 }
	 }catch(Exception e){}
	}
}
public class Vowels 
{
	public static void main(String[] args)
	{
	 VDemo th=new VDemo();
	 th.start();
	}

}

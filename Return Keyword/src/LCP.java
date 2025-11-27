import java.lang.reflect.Array;
import java.util.Arrays;

public class LCP 
{
	String longestcp(String strs[])
	{
		//Stringbuilder for immutbility
		StringBuilder s1=new StringBuilder();
		//sort array
		Arrays.sort(strs);
		//extract first and last String and convert into char arrau
		char first[]=strs[0].toCharArray();
		char last[]=strs[strs.length-1].toCharArray();
		//compare first and last upto first string length
		for(int i=0;i<first.length;i++)
		{
			if(first[i]!=last[i])
			{
				break;
			}
			s1.append(first[i]);
		}
		return s1.toString();
	}
	public static void main(String[] args) 
	{
	 LCP ob=new LCP();
	 System.out.println(ob.longestcp(new String[] {"flower","eew","rteight","yuh"}));
		
	}

}

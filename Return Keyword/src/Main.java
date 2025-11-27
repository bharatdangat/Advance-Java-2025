//call getMessage method of  R without creating ob of R
public class Main 
{
public static void main(String[] args)
{
	P p=new P();
	Q q=p.getInfo();
	R r=q.getHistory();
	String s=r.getMessage();
	System.out.println(s);
}
}

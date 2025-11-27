import java.util.ArrayList;

public class MainStudent
{
	public static void main(String[] args)
	{
	 CreateStudent s=new CreateStudent();
	 ArrayList<Student> a=s.getInfo();
	 for(Student ss:a)
	 {
		 System.out.println("Roll No-"+ss.getRno());
		 System.out.println(" Name-"+ss.getName());
		 System.out.println("Theory marcks-"+ss.getMarcks().theorymarcks);
		 System.out.println("Practical marcks-"+ss.getMarcks().practicalmarcks);
	     System.out.println("**********************************");
	 }
	}

}

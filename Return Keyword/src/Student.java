public class Student 
{
  private int rno;
  private String name;
  private Marcks marcks;
  
  public Student(int rno,String name,Marcks marcks)
  {
	  this.rno=rno;
	  this.name=name;
	  this.marcks=marcks;
  }
  
  void setRno(int rno)
  {
	  this.rno=rno;
  }
  int getRno()
  {
	  return rno;
  }
  void setName(String name)
  {
	  this.name=name;
  }
  String getName()
  {
	  return name;
  }
  void setMarcks()
  {
	  this.marcks=marcks;
  }
  Marcks getMarcks()
  {
	  return marcks;
  }
}

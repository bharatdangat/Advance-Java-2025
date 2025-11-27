public class Cricketer
{
  int age;
  String name;
  
  Cricketer(int age,String name)
  {
	  this.age=age;
	  this.name=name;
  }

@Override
public String toString()
{
	return "Cricketer [\nAge of Cricketer="+ age + ", \nName of Cricketer=" + name + "]";
}
  
}

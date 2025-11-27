class Cricketer
{
	private int jersyno;
	private String name;
	private int runs;
	public Cricketer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cricketer(int jersyno, String name, int runs) {
		super();
		this.jersyno = jersyno;
		this.name = name;
		this.runs = runs;
	}
	public int getJersyno() {
		return jersyno;
	}
	public void setJersyno(int jersyno) {
		this.jersyno = jersyno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs)
	{
		 if(runs>=100)
		this.runs = runs;
	}
	
}

public class POJO 
{
	public static void main(String[] args)
	{
	 Cricketer c=new Cricketer();
	 c.setJersyno(27);
	 c.setName("Virat");
	 c.setRuns(400);
		
	 System.out.println("Jersy No-"+c.getJersyno());
	 System.out.println("Name-"+c.getName());
	 System.out.println("Runs-"+c.getRuns());
	 
	}

}

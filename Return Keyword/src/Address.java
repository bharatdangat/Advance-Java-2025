public class Address 
{
  String homeaddr;
  String officeaddr;
  
  public String getHomeaddr() {
	return homeaddr;
}

public void setHomeaddr(String homeaddr) {
	this.homeaddr = homeaddr;
}

public String getOfficeaddr() {
	return officeaddr;
}

public void setOfficeaddr(String officeaddr) {
	this.officeaddr = officeaddr;
}

Address(String homeaddr,String officeaddr)
  {
	  this.homeaddr=homeaddr;
	  this.officeaddr=homeaddr;
  }
}

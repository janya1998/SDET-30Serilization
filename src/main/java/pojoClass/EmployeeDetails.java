package pojoClass;

public class EmployeeDetails {
	//globally declare 
	int id;
	String name;
	int phno;
	String address;
	String emailid;
//create constuctor intilize variables
	public EmployeeDetails(int id,String name,int phno,String address,String emailid) {
		 this.id=id;
		 this.name=name;
		 this.phno=phno;
		 this.address=address;
		 this.emailid=emailid;
		
	}
	public EmployeeDetails()
	{
		
	}
	//create getters and setters to acess the variables
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	

}

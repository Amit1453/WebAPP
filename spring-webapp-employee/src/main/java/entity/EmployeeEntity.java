package entity;

public class EmployeeEntity 
{
	private int id;
	private String name;
	private String salary;
	private String emailId;
	private String password;
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(int id, String name, String salary, String emailId, String password) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.emailId = emailId;
		this.password = password;
	}
	
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getemailId() {
		return emailId;
	}
	public void setemailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() 
	{
		return "EmployeeEntity [id=" + id + ", name=" + name + ", salary=" + salary + ", emailId=" + emailId
				+ ", password=" + password + "]";
	}
	
	
}

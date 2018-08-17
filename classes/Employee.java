public class Employee extends User{
	String role;

	public Employee(String firstName , String lastName , String role){
		super(firstName,lastName);
		this.role = role;
	}

}
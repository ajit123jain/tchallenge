import java.util.*;
import java.io.*;
public class User /*extends Dummy*/{
	String firstName;
	String lastName;
	Integer age;
	Long salary;
	Date dateOfBirth;

	public User(String firstName, String lastName, Integer age, Long salary, Date dateOfBirth){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
	}

	public User(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static void main(String[] args) {
		ArrayList<User> userlist = new ArrayList<>();
		User Kevin = new User("Ajit","Jain");
		User Peter = new User("rahul","Singh");
		userlist.add(Kevin);
		userlist.add(Peter);

		for (int i=0; i<userlist.size(); i++) {
			System.out.println("firstName: "+userlist.get(i).firstName.substring(0, 1).toUpperCase()+userlist.get(i).firstName.substring(1)+" lastName: "+userlist.get(i).lastName);
		}
	}

}
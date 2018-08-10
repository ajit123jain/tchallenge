class User{
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

}
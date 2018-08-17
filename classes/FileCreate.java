import java.util.*;
import java.io.*;
public class FileCreate{
	public static void main(String args[]){
		ArrayList<Employee> employeeList = new ArrayList<>();
		ArrayList<Manager> managerList = new ArrayList<>();

    employeeList.add(new Employee("Ajit", "Jain", "employee"));
		employeeList.add(new Employee("Ankit", "Singh", "employee"));
		employeeList.add(new Employee("Daksha", "Jain", "employee"));
    employeeList.add(new Employee("Ravi", "Jain", "employee"));
    
    managerList.add(new Manager("Ajit", "Jain", "employee"));
		managerList.add(new Manager("Ankit", "Singh", "employee"));
		managerList.add(new Manager("Daksha", "Jain", "employee"));
    managerList.add(new Manager("Ravi", "Jain", "employee"));
    
    //Employee conosle print
    // for (int i=0; i<employeeList.size(); i++){
    // 	System.out.println(employeeList.get(i).firstName);
    // }

    String employeeFileName = "employee.txt";
    String managerFileName = "manager.txt";

    try {	
    	FileWriter employeeWriter = new FileWriter(employeeFileName);
    	FileWriter managerWriter = new FileWriter(managerFileName);
    	BufferedWriter bufferedEmployeeWriter = new BufferedWriter(employeeWriter);
			BufferedWriter bufferedManagerWriter = new BufferedWriter(managerWriter);

			for (int i=0; i<employeeList.size(); i++){
    	bufferedEmployeeWriter.write("first_name="+employeeList.get(i).firstName+","+"last_name="+employeeList.get(i).lastName+"..\n");
    	}	

    	for (int i=0; i<managerList.size(); i++){
    	bufferedManagerWriter.write("first_name="+managerList.get(i).firstName+","+"last_name="+managerList.get(i).lastName+"..\n");
    	}	

    	bufferedEmployeeWriter.close();
    	bufferedManagerWriter.close();



    }
    catch(IOException ex){

    }

	}
}
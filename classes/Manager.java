import java.util.*;
import java.io.*;
public class Manager extends User{
	String role;
		public Manager(String firstName , String lastName , String role){
		super(firstName,lastName);
		this.role = role;
	}
}
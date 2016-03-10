package digitcashiermvc.models;


public class Employee {
	String name;
	String password;
	
	public Employee(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
}

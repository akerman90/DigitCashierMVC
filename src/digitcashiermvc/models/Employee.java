package digitcashiermvc.models;


public class Employee {
	String name;
	char[] password;
	
	public Employee(char[] password){
		this.password = password;
	}
	
	public char[] getPassword(){
		return password;
	}
}

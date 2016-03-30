package by.grodno.staneuski;

public class Employee {
	
	private String employeeNumber;
	private String name;
	private int age;
	private boolean gender;
	private Workspace workspace;
	
	public Workspace getWorkspace() {
		return workspace;
	}
	public void setWorkspace(Workspace workspace) {
		this.workspace = workspace;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Employee(String employeeNumber, String name, int age, boolean gender, Workspace workspace) {
		super();
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.workspace = workspace;
	}
}

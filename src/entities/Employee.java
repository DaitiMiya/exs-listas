package entities;

public class Employee {
	Integer id;
	String name;
	Double salary;
	
	public Employee(Integer id, String name,Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void increasSalary(double percentage) {
		 salary = salary + salary * percentage/100.0;
	}
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
}

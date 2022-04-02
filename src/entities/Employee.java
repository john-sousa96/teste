package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	//public Double tax;	
	
	public Employee(Integer id, String name, Double salary) {
		
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary (Double percentage) {
		this.salary += this.salary * (percentage/100.00);
	}
	
	public String toString() {
		return id 
				+", "
				+ name
				+", "
				+salary;
	}
	

	
	
	
	/*
	 * public double NetSalary() { double netSalary; netSalary = grossSalary - tax;
	 * return netSalary; }
	 */
	
	
	/*
	 * public double IncreaseSalary (double percentage) { double newSalary;
	 * newSalary = grossSalary + (grossSalary * (percentage/100)); return newSalary;
	 * }
	 */
}

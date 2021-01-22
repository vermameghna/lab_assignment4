package labAssignment4;

import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	
	private Address address;
	private transient double salary;
	
	
	
	public Employee() {}

	public Employee(String name, String id, Address address, double salary) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=").append(name).append(", id=")
				.append(id).append(", address=").append(address)
				.append(", salary=").append(salary).append("]");
		return builder.toString();
	}
	
	
}

package labAssignment4;

import java.io.Serializable;

public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String address;

	public Address() {}

	public Address(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [address=").append(address).append("]");
		return builder.toString();
	}
	
	
}

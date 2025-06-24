package com.spring.Scope;

public class Customer {
	
	int customerId;
	String customerName;
	String address;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	void displayCustomerDetails() {
		System.out.println("Customer Details: ");
		System.out.println("Customer Id = "+customerId);
		System.out.println("Customer Name = "+customerName);
		System.out.println("Address of the Customer = "+address);
		System.out.println("Customer Id = "+customerId);
		System.out.println("--- Hi git from kalyan ---");
		System.out.println("--- Hi git from Rafi ---");
		System.out.println("--- welcome to git ---");
		System.out.println("--- welcome to Durga ---");
		System.out.println("--- welcome to ravi ---");
		

		
	}

}

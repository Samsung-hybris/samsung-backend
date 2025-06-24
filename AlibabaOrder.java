package com.java.MultiLevelInheritance1;

public class AlibabaOrder extends AlibabaCart {

	int orderId;

	String OrderTime;

	double orderPrice;

	double calulateTotalOrderPrice(int orderEntries) {
		return orderEntries * orderPrice;
	}

	void order() {
		
		
		System.out.println("order Id = " + orderId);
		
		
		System.out.println("Order Time = " + OrderTime);
		System.out.println("Order Price = " + orderPrice);
		System.out.println();
	}
}

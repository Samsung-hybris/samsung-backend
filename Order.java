package com.spring;

public class Order {

	Product product;
	
	public Order(Product prd) {
		this.product = prd;
		}
	public void display() {
		System.out.println("Product Id = "+product.productId);
		System.out.println("Product Name = "+product.productName);
				System.out.println("Product Id = "+product.productId);
		System.out.println("Product Name = "+product.productName);
		System.out.println("** Product Details **");
		System.out.println("** Thank You & Visit Again **");
		System.out.println("** Product updates **");
		System.out.println("** product information **");
		
		
	}
}

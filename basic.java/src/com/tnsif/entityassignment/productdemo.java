package com.tnsif.entityassignment;

public class productdemo {

	public static void main(String[] args) {
		Product p1= new Product();
		Product p2=new Product();
		Product p3=new Product();
		p1.setProductName("Chocolate");
		p1.setProductid(111);
		p1.setPrice(50);
		p2.setProductName("Biscuit");
		p2.setProductid(222);
		p2.setPrice(100);
		p3.setProductName("Cooldrinks");
		p3.setProductid(333);
		p3.setPrice(150);
		System.out.println("The product details are: ");
		System.out.println("the name of the product 1 is "+p1.getProductName());
		System.out.println("The product id of the product 1 is "+p1.getProductid());
		System.out.println("The price of product 1 is "+p1.getPrice());
		System.out.println("The product details are: ");
		System.out.println("the name of the product 2 is "+p2.getProductName());
		System.out.println("The product id of the product 2 is "+p2.getProductid());
		System.out.println("The price of product 2 is "+p2.getPrice());
		System.out.println("The product details are: ");
		System.out.println("the name of the product 3 is "+p3.getProductName());
		System.out.println("The product id of the product 3 is "+p3.getProductid());
		System.out.println("The price of product 3 is "+p3.getPrice());
		
		

	}

}

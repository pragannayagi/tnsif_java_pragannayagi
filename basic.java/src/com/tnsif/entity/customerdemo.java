package com.tnsif.entity;

public class customerdemo {

	public static void main(String[] args) {
		 customer c1=new customer();
		 customer c2=new customer();
		 c1.setId(11);
		 c1.setName("aaa");
		 c1.setCity("TN");
		 c2.setId(22);
		 c2.setName("bbb");
		 c2.setCity("US");
		 System.out.println("The deatils of customer 1 are: ");
		 System.out.println("ID: "+c1.getId());
		 System.out.println("NAME: "+c1.getName());
		 System.out.println("CITY: "+c1.getCity());
		 System.out.println("The deatils of customer 2 are: ");
		 System.out.println("ID: "+c2.getId());
		 System.out.println("NAME: "+c2.getName());
		 System.out.println("CITY: "+c2.getCity());

	}

}

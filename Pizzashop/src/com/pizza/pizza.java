package com.pizza;


class demand {
	static void main1() {
		System.out.println("Welcome! To our pizza shop.. \n");
		System.out.println("------------------------------------");

		System.out.println("Select Cuisines\n");
		System.out.println("------------------------------------");
		System.out.println("1.Regular \n" +"2.Jain \n" +"3.Non-Veg\n");
		System.out.println("------------------------------------");
	}
}
public class pizza {
	public static void main(String args[]) {
		demand.main1();
		Categories c= new Categories();
		c.demo();
	}
}

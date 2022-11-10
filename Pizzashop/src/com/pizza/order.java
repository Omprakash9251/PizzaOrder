package com.pizza;

import java.util.Scanner;

public class order {
	void Placeorder() {
		System.out.println("Enter 1 for order 0 for Cancle.. \n" + "-------------------------------"
				+ ""
				+ "------- \n");
		Scanner sc = new Scanner(System.in);
		int choise = sc.nextInt();
		if(choise == 1) {
			System.out.println("Order Placed...");
		}
		else if(choise == 0) {
			System.out.println("Order Canceled...");
		}
		else {
			System.out.println("Enter valid option..");
			Placeorder();
		}
	}
}

package com.pizza;

import java.util.Scanner;

public class Categories {
	void demo() {
		demo d1=new demo();
		Scanner sc = new Scanner(System.in); 
			System.out.println("Select your pack :");
			int choise =sc.nextInt();
			if(choise == 1) {
				System.out.println("You Choose Regular\n");	
				d1.choise();
			}
			else if(choise == 2) {
				System.out.println("You Choose Jain\n");	
				d1.choise();
			}
			else if(choise == 3) {
				System.out.println("You Choose Non-veg\n");	
				d1.choise();
			}
			else {
				System.out.println("Wrong Input..\n"+"Choose valid Cuisine");
				System.out.println("------------------------------------");
				demo();
			}
	}
}
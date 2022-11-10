package com.pizza;

//package com.pizza;

import java.util.Scanner;

class demo {
	void choise() {
		System.out.println("1.Classic \n" +"2.Premium \n" +"3.Supreme\n");
		demo1 d2 = new demo1();
		try (Scanner sc1 = new Scanner(System.in)) {
			System.out.println("Select your pack :");
			int choise = sc1.nextInt();
			
			if(choise == 1) {
				System.out.println("You choose Classic");
				d2.classic();
			}
			else if(choise == 2) {
				System.out.println("You choose Premium");
				d2.premium();
			}
			else if(choise == 3) {
				System.out.println("You choose Supreme");
				d2.Supreme();
			}
			else {
				System.out.println("Choose from the menu please! ");
				choise();
			}
		}
	} 

}
class demo1 extends demo {
	void classic() {
		System.out.println("1.Tomchi \n" +"2.Caponito \n");
		try (Scanner sc2 = new Scanner(System.in)) {
			System.out.println("Select your pack :");
			int choise = sc2.nextInt();
			ingredients ig = new ingredients();
			prise ps = new prise();
			order or = new order();
			
			if (choise == 1) {
				System.out.println("Which Ingreadients do you want in your tomchi...\n"+"1.Tomato \n" +"2.Onion \n"+"3.Chilly/Cheese\n"+"4.All\n");
				ig.tomchi();
				ps.classicT();
				or.Placeorder();		
			}
			else if(choise == 2) {
				System.out.println("Which Ingreadients do you want in your Caponito...\n"+"1.Capsicum \n" +"2.Onion \n"+"3.Tomato/Cheese\n"+"4.All\n");
				ig.tomchi();
				ps.ClassicC();
				or.Placeorder();
			}
			else {
				System.out.println("Choose from the menu please! ");	
				classic();
			}
		}
	}
	void premium() {
		System.out.println("1.Red Indian \n" +"2.Party Lovers \n");
		try (Scanner sc3 = new Scanner(System.in)) {
			System.out.println("Select your pack :");
			int choise = sc3.nextInt();
			ingredients ig = new ingredients();
			prise ps = new prise();
			order or = new order();
			if (choise == 1) {
				System.out.println("Which Ingreadients do you want in your Red Indian...\n"+"1.Cheese \n" +"2.Paneer \n"+"3.Chilly\n"+"4.All\n");
				ig.tomchi();
				ps.PremiumRI();
				or.Placeorder();
			}
			else if(choise == 2) {
				System.out.println("Which Ingreadients do you want in your Party Lover...\n"+"1.Cheese \n" +"2.Sweet Corn \n"+"3.Tomato\n"+"4.Capsicum"+"5.All\n");
				ig.tomchi();
				ps.PremiumPL();
				or.Placeorder();
			}
			else {
				System.out.println("Choose from the menu please! ");	
				premium();
			}
		}
	}
	void Supreme() {
		System.out.println("1.American Heat \n" +"2.Re-Union \n");
		try (Scanner sc4 = new Scanner(System.in)) {
			System.out.println("Select your pack :");
			int choise = sc4.nextInt();
			ingredients ig = new ingredients();
			prise ps = new prise();
			order or = new order();
			if (choise == 1) {
				System.out.println("Which Ingreadients do you want in your American Heat...\n"+"1.Cheese \n" +"2.Capscium \n"+"3.Baby Corn \n"+"4.All\n");
				ig.tomchi();
				ps.SupremeAH();
				or.Placeorder();
			}
			else if(choise == 2) {
				System.out.println("Which Ingreadients do you want in your Re-Union...\n"+"1.Cheese \n" +"2.Spinach \n"+"3.Cheese\n"+"4.Baby Corn \n"+"5.Olives"+"6.All\n");
				ig.tomchi();
				ps.SupremeRU();
				or.Placeorder();
			}
			else {
				System.out.println("Choose from the menu please! ");	
				Supreme();
			}
		}
	}
}




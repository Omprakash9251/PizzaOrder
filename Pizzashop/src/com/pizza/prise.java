package com.pizza;

import java.util.*;

public class prise extends ingredients{

		void classicT(){
			System.out.println("Select pizza size\n" +"--------------------------------\n"+ "1.For Regular 135\n"+"2.For Medium 210\n"+"3.For Large 360\n");
			Scanner sc = new Scanner(System.in);
			int classic = sc.nextInt();
			if (classic == 1) {
				int regular = 135;
				System.out.println("Your have selected Classic Tomchi regular worth"+regular);
			}
			else if (classic == 2) {
				int medium = 210;
				System.out.println("Your have selected Classic Tomchi Medium worth"+medium);
			}
			else if (classic == 3) {
				int Large = 360;
				System.out.println("Your have selected Classic Tomchi Large worth "+ Large);
			}
		}
		void ClassicC() {
			System.out.println("Select pizza size\n" +"--------------------------------\n"+ "1.For Regular 135\n"+"2.For Medium 210\n"+"3.For Large 360\n");
			Scanner sc = new Scanner(System.in);
			int classic = sc.nextInt();
			if (classic == 1) {
				int regular = 135;
				System.out.println("Your have selected Classic Caponito regular worth"+regular);
			}
			else if (classic == 2) {
				int medium = 210;
				System.out.println("Your have selected Classic Caponito Medium worth"+medium);
			}
			else if (classic == 3) {
				int Large = 360;
				System.out.println("Your have selected Classic Caponito Large worth "+ Large);
			}
		}
		void PremiumRI() {
			System.out.println("Select pizza size\n" +"--------------------------------\n"+ "1.For Regular 165\n"+"2.For Medium 240\n"+"3.For Large 395\n");
			Scanner sc = new Scanner(System.in);
			int classic = sc.nextInt();
			if (classic == 1) {
				int regular = 165;
				System.out.println("Your have selected Classic Red-Indian regular worth"+regular);
			}
			else if (classic == 2) {
				int medium = 240;
				System.out.println("Your have selected Classic Red-Indian Medium worth"+medium);
			}
			else if (classic == 3) {
				int Large = 395;
				System.out.println("Your have selected Classic Red-Indian Large worth "+ Large);
			}
		}
		void PremiumPL() {
			System.out.println("Select pizza size\n" +"--------------------------------\n"+ "1.For Regular 165\n"+"2.For Medium 240\n"+"3.For Large 395\n");
			Scanner sc = new Scanner(System.in);
			int classic = sc.nextInt();
			if (classic == 1) {
				int regular = 165;
				System.out.println("Your have selected Classic Party-Lovers regular worth"+regular);
			}
			else if (classic == 2) {
				int medium = 240;
				System.out.println("Your have selected Classic Party-Lovers Medium worth"+medium);
			}
			else if (classic == 3) {
				int Large = 395;
				System.out.println("Your have selected Classic Party-Lovers Large worth "+ Large);
			}
		}
		void SupremeAH() {
			System.out.println("Select pizza size\n" +"--------------------------------\n"+ "1.For Regular 190\n"+"2.For Medium 290\n"+"3.For Large 425\n");
			Scanner sc = new Scanner(System.in);
			int classic = sc.nextInt();
			if (classic == 1) {
				int regular = 190;
				System.out.println("Your have selected Classic American-Heat regular worth"+regular);
			}
			else if (classic == 2) {
				int medium = 290;
				System.out.println("Your have selected Classic American-Heat Medium worth"+medium);
			}
			else if (classic == 3) {
				int Large = 425;
				System.out.println("Your have selected Classic American-Heat Large worth "+ Large);
			}
		}
		void SupremeRU() {
			System.out.println("Select pizza size\n" +"--------------------------------\n"+ "1.For Regular 190\n"+"2.For Medium 290\n"+"3.For Large 425\n");
			Scanner sc = new Scanner(System.in);
			int classic = sc.nextInt();
			if (classic == 1) {
				int regular = 190;
				System.out.println("Your have selected Classic Reunion regular worth"+regular);
			}
			else if (classic == 2) {
				int medium = 290;
				System.out.println("Your have selected Classic Reunion Medium worth"+medium);
			}
			else if (classic == 3) {
				int Large = 425;
				System.out.println("Your have selected Classic Reunion Large worth "+ Large);
			}
		}
		
}




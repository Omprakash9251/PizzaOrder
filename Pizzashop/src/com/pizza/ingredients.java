package com.pizza;

import java.util.Scanner;

public class ingredients {
	void tomchi() {
	Scanner sc = new Scanner(System.in);
	System.out.println("How many ingredients do you want in your Pizza?");
	String[] string = new String[sc.nextInt()];
	sc.nextLine();	
	System.out.println("Type Ingreadients");
	for(int i =0; i < string.length; i++) {
		string[i] = sc.nextLine();
	}
	System.out.println("choosed ingredients ");
//	String s =string[i];
	for (String str: string) {
		System.out.println(str);
	}
	}
	
}
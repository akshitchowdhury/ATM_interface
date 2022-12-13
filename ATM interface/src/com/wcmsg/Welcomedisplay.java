package com.wcmsg;

import java.util.Scanner;

public class Welcomedisplay {

	
	public static void display () {
		
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Welcome to the ATM interface");
		
		//String name = sc.nextLine();
		
		System.out.println("Welcome new User");
		
	}
	
	public static void lists() {
 
		
		/*
		 * System.out.println("1. Create new account. ");
		 * System.out.println("2. Display Balance. ");
		 * System.out.println("3. Withdraw Money");
		 * System.out.println("4. Transfer Money to guest account.");
		 * System.out.println("5. Change ATM pin number. ");
		 * System.out.println("6. Type 'exit'to Exit the interface. ");
		 */
	String arr[] = {"1. Create new account.", "2. Display Balance.","3. Withdraw Money","4. Transfer Money to guest account.",
			"5. Change ATM pin number. ", "6. Type 'exit'to Exit the interface. "
	} ;
	
	for (int i = 0; i< arr.length; i++) {
		
		System.out.println(arr[i]);
		
	}
	
	}
	
	
}

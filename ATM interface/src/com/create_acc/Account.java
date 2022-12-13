package com.create_acc;

import java.util.Scanner;

public class Account {
	
	long rnd = (long) (Math.random()*1000*1000);
	String sample = "101";
	
	public String ac_id = sample+rnd;
	
	public String password = "Ashura";
	
	public void sysout() {
		// TODO Auto-generated method stub

		System.out.println("You have chosen to Create an account. ");
		
	}
	
	public void credentials() {
	
		
		System.out.println("Please enter your name : " );
		Scanner ac = new Scanner(System.in);
		String name = ac.nextLine();
		
		System.out.println("Type in 10 digit phone number :" );
		
		long phone = ac.nextLong();
		
		System.out.println("Enter your email id : ");
	
		
		String email = ac.next();
		
		
		/*
		 * long rnd = (long) (Math.random()*1000*1000); String sample = "101";
		 * 
		 * String ac_id = sample+rnd;
		 */
		System.out.println("Your acc no generated is : " +ac_id );
		
		System.out.println("Your credentials are :" +" "+ name +" "+ phone+" "+ email+" "+ac_id);
		
		
	}
	
	
	
	
	
	
}

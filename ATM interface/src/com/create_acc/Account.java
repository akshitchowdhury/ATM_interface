package com.create_acc;

import java.util.Scanner;

public class Account {

	long rnd = (long) (Math.random() * 1000 * 1000);
	/* String sample = "101"; */
     
	int sample = 101;
     	
	/**
	 * @param rnd
	 * @param sample
	 * @param ac_id
	 * @param password
	 * @param balance
	 */

	public String ac_id = sample+""+rnd;

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private int Balance;

	/**
	 * @param balance
	 */
	public Account(int balance) {
		super();
		Balance = balance;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public void sysout() {
		// TODO Auto-generated method stub

		System.out.println("You have chosen to Create an account. ");

	}

	public void diplay_Cred() {

		/* Account vis = new Account(); */

		System.out.println("Your acc no generated is : " + ac_id);

		System.out.println("Your credentials are : ");

	}

	
	  public String getAc_id() { return ac_id; }
	  
	  public void setAc_id(String ac_id) { this.ac_id = ac_id; }
	 
	public void credentials() {

		System.out.println("Please enter your name : ");
		Scanner ac = new Scanner(System.in);
		String name = ac.nextLine();

		System.out.println("Type in 10 digit phone number :");

		long phone = ac.nextLong();

		System.out.println("Enter your email id : ");

		String email = ac.next();
		
		diplay_Cred();
		System.out.println(name +" "+ phone+" " + email+" "+ ac_id);  

		/*
		 * long rnd = (long) (Math.random()*1000*1000); String sample = "101";
		 * 
		 * String ac_id = sample+rnd;
		 * 
		 * System.out.println("Your acc no generated is : " +ac_id );
		 * 
		 * System.out.println("Your credentials are :" +" "+ name +" "+ phone+" "+
		 * email+" "+ac_id);
		 */
		
		
		
	}

}

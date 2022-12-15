package com.withdraw;

import java.util.Scanner;

import com.balance_chk.Balance;
import com.balance_chk.Deposit_driver;



public class Withdrawal {

	
	//static int green;
	
	
	
	public static int subtract;
	public static int leftover;

	public void deduct() {
		
		Deposit_driver rd = new Deposit_driver();
		Balance sub = new Balance();
		
		Scanner wd = new Scanner(System.in);
		
		System.out.println("Enter the amount to withdraw : ");
		
		/*
		 * int subtract = wd.nextInt(); int leftover = rd.getGreen()-subtract ;
		 */
		
		subtract = wd.nextInt();
		leftover = rd.getGreen()-subtract ;
		
		System.out.println("Remaining balance in account : " + leftover);
		
		
	}
	public static void main(String[] args) {
		Withdrawal wow = new Withdrawal();
		wow.deduct();
	}
}

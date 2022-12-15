package com.balance_chk;

import java.util.Scanner;

import com.create_acc.Account;

public class Balance {

	Account blnce = new Account();
	
	public void display_blnc() {
		
		blnce.setBalance(10000);
		
		System.out.println("Your current Balance is" +" "+blnce.getBalance()  );
	}
	
	public void ac_verifier() {
		
		System.out.println("Type in your password");
		
		Scanner bl = new Scanner(System.in);
		
		String check = bl.nextLine();
		
		Account cred = new Account();
		
		cred.setPassword(check);
		
		if (check.equals(check)) {
			System.out.println("Authorisation granted ");
			display_blnc(); 
			
		}
		
		else {
			System.out.println("Access denied");
		}
	}
	
}

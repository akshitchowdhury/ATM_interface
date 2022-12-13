package com.balance_chk;

import java.util.Scanner;

import com.create_acc.Account;

public class Balance {

	public void ac_verifier() {
		
		System.out.println("Type in your password");
		
		Scanner bl = new Scanner(System.in);
		
		String check = bl.nextLine();
		
		Account cred = new Account();
		
		
		
		if (check.equals(cred.password)) {
			System.out.println("Authorisation granted ");
			
		}
		
		else {
			System.out.println("Access denied");
		}
	}
	
}

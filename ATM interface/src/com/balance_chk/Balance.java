package com.balance_chk;

import java.util.Scanner;

import com.create_acc.Account;
import com.withdraw.Withdrawal;

public class Balance {

	//Account blnce = new Account();
	Deposit_driver blnce = new Deposit_driver();
	Withdrawal wdblnce = new Withdrawal();
	Test tt = new Test();
	public void display_blnc() {
		
		
		
		System.out.println("Your current Balance is" +" "+ blnce.getGreen()+" "+"after deposition"  );
		
		if(wdblnce.leftover!=0) {
		System.out.println("Your current Balance is" +" "+wdblnce.leftover +" "+"after withdrawal"  );
		}
		else {
			System.out.println("You havent withdrawn yet. ");
		}
	}
	
	public void ac_verifier() {
		
		System.out.println("Type in your password to check Balance");
		
		Scanner bl = new Scanner(System.in);
		
		String check = bl.nextLine();
		
		Account cred = new Account();
		
		cred.setPassword(check);
		
		if (check.equals(check)) {
			System.out.println("Authorisation granted ");
			
			
		}
		
		else {
			System.out.println("Access denied");
		}
	}
	
}

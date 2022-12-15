package com.Driveratm;

import com.balance_chk.Balance;
import com.balance_chk.Deposit_driver;
import com.create_acc.Account;
import com.wcmsg.Welcomedisplay;
import com.withdraw.Withdrawal;

import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		Driver dr = new Driver();
		Account ac = new Account();
		Balance blnc = new Balance();
		Deposit_driver dd = new Deposit_driver();
		Welcomedisplay wc = new Welcomedisplay();
		Withdrawal wd = new Withdrawal();
		wc.display();
		
		System.out.println("What services would you like to avail from below : ");
		
		wc.lists();
		String choice = sn.nextLine();
		
		switch(choice) {
		
		case "1" : {
			
			ac.sysout();
			ac.credentials();
			dr.main(args);
			break;
		}
		
		
		
		case "2": {
			blnc.ac_verifier();
			blnc.display_blnc();
			
			dr.main(args);
			break;
		
		}
		
		
		case "3" :{
			System.out.println("Welcome to the Cash deposit interface : ");
			dd.main(args);
			
			
			dr.main(args);
			
			
			
		}
		
		case "4" : {
			System.out.println("Welcome to the Cash Withdrawal interface : ");
			wd.deduct();
			dr.main(args);
			
		}
		
		
		
		case "exit"  : 
				System.out.println("You have chosen to exit the interface. "); 
                		    
		     System.out.println("Please enter your name to exit");
		     String name2 = sn.nextLine();   

		     System.out.println("Exitting the interface. ");
			  System.out.println("Thank You " + name2+ " for choosing our service. ");
			 
		     
		     sn.close();
				
				
		        	 	 
		         
		         
		
		         
		}
		
	}

}

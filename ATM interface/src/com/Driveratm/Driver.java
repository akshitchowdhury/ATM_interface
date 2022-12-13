package com.Driveratm;

import com.balance_chk.Balance;
import com.create_acc.Account;
import com.wcmsg.Welcomedisplay;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		Account ac = new Account();
		Balance blnc = new Balance();
		
		Welcomedisplay wc = new Welcomedisplay();
		wc.display();
		
		System.out.println("What services would you like to avail from below : ");
		
		wc.lists();
		String choice = sn.nextLine();
		
		switch(choice) {
		
		case "1" : {
			
			ac.sysout();
			ac.credentials();
			
		}
		
		
		
		case "2": {
			blnc.ac_verifier();
		}
		break;
		
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

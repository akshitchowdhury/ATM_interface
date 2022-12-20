package com.changepin;

import java.util.Scanner;

import org.jboss.jandex.Main;

import com.create_acc.Account;

public class Pin {

	public int getPin() {
		return pin;
	}

	public int setPin(int pin) {
		return this.pin = pin;
	}

	private int pin;
	
	public void change() {
		
		Account account = new Account();
		
		Scanner passcode = new Scanner(System.in);
		
		System.out.println("please enter your account id to continue. ");
		
		account.setAc_id(passcode.next());
		
		if(account.getAc_id().equals(account.ac_id)) {
			
			System.out.println("Set new four digit pin : ");
			
			int key  =setPin(passcode.nextInt());;
			
			
			
			
			System.out.println("Enter pin again to reconfirm. ");
			
			int key2  =setPin(passcode.nextInt());
			
			if(key==key2) {
				System.out.println("Your new pin has been generated." + getPin());
			}
			
			else {
				
				System.out.println("Wrong pin, try again");
				
				change();
			}
			
			System.out.println(getPin());
			
		}
		
		else {
			
			System.out.println("invalid pin");
		}
		
		
		
	}
	
	/*public static void main(String[] args) {
		Pin pinner = new Pin();
		pinner.change();*/
		
	
}

package com.Deposit;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Deposit_driver {

	public static int green;
	public static void main(String[] args) {
		Balance left = new Balance();
		Test tester = new Test();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first serial entry: ");
		int sno = sc.nextInt();
		
		System.out.println("Enter the amount you want to deposit");
        int money = sc.nextInt();
        
        System.out.println("Enter the 2nd serial entry: ");
		int sno2 = sc.nextInt();
		
		
		System.out.println("Enter the amount you want to deposit");
        int money2 = sc.nextInt();
		
        
		/*
		 * 
		 *  System.out.println("Total balance "+ green);
		 */
        //green = money+money2;
        green = tester.setTest_amnt(money2+money);
		
        
        /*
		 *Can be tried with Inheritance 'extends' theory
		 * test_amnt = money2+money; green = test_amnt;
		 */
       
        
        Configuration cfg = new Configuration();
		cfg.configure("atm.cfg.xml");
		
		SessionFactory s = cfg.buildSessionFactory();
		Session sesh = s.getCurrentSession();
		
		Deposit d1 = new Deposit();
		d1.setSno(sno);
		d1.setAmount(money);
		d1.setTotal(0);
		
		Deposit d2 = new Deposit();
		d2.setSno(sno2);
		d2.setAmount(money2);
		d2.setTotal(green);
		
		sesh.beginTransaction();
		sesh.save(d1);
		sesh.save(d2);
		
		sesh.getTransaction().commit();
		
		//sesh.close();
		
		
		left.ac_verifier();
		
		left.display_blnc();
		
		
		
	}
	public static int getGreen() {
		return green;
	}
	public static void setGreen(int green) {
		Deposit_driver.green = green;
	}
	
	
}

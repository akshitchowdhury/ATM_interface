package com.balance_chk;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Deposit_driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first serial entry: ");
		int sno = sc.nextInt();
		
		System.out.println("Enter the amount you want to deposit");
        int money = sc.nextInt();
        
        System.out.println("Enter the 2nd serial entry: ");
		int sno2 = sc.nextInt();
		
		
		System.out.println("Enter the amount you wan to deposit");
        int money2 = sc.nextInt();
		
        
        int totally = money+money2;
        System.out.println("Total balance "+ totally);
        
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
		d2.setTotal(totally);
		
		sesh.beginTransaction();
		sesh.save(d1);
		sesh.save(d2);
		
		sesh.getTransaction().commit();
		
		//sesh.close();
		
		
		
	}
	
	
}

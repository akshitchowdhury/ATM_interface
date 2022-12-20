package com.Deposit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="depostion")
public class Deposit {

	@Id
	@Column(name="S_no")
	private int sno;
	
	@Column(name="deposit_amnt")
	private int amount;
	
	@Column(name="total_depositd")
	private int total;
	/**
	 * 
	 */
	public Deposit() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param sno
	 * @param amount
	 * @param total
	 */
	public Deposit(int sno, int amount, int total) {
		super();
		this.sno = sno;
		this.amount = amount;
		this.total = total;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}

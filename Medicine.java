package com.xworkz.encapsulation;

public class Medicine {
	private String name;
	private String mfd;
	private String expDate;
	private double mg;
	private int price;

	private void cureDisease() {
		System.out.println("Disease cure");
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setmfd(String mfd) {
		this.mfd = mfd;
	}

	public void setexpDate(String expDate) {
		this.expDate = expDate;
	}

	public void setmg(double mg) {
		this.mg = mg;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public String getname() {
		return this.name;
	}

	public String getmfd() {
		return this.mfd;
	}

	public String getexpDate() {
		return this.expDate;
	}

	public double getmg() {
		return this.mg;
	}

	public int getprice() {
		return this.price;
	}
}

package com.xworkz.encapsulation;

public class SimCard {

	private String simname;
	private String simType;
	private String plan;
	private String validity;
	private int price;

	private void acivation() {
		System.out.println("sim is activation");
	}

	private void block() {
		System.out.println("sim is blocked");
	}

	private void port() {
		System.out.println("sim card port");
	}

	public void setsimname(String simname) {
		this.simname = simname;
	}

	public void setsimType(String simType) {
		this.simType = simType;
	}

	public void setplan(String plan) {
		this.plan = plan;
	}

	public void setvalidity(String validity) {
		this.validity = validity;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public String getsimname() {
		return this.simname;
	}

	public String getsimType() {
		return this.simType;
	}

	public String getplan() {
		return this.plan;
	}

	public String getvalidity() {
		return this.validity;
	}

	public int getprice() {
		return this.price;
	}
}
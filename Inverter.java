package com.xworkz.encapsulation;

public class Inverter {

	private String Brand;
	private String series;
	private String capacity;
	private int weight;
	private int price;

	private void powerBackup() {
		System.out.println("inverter having high charge acceptence and low maintanence");
	}

	public void setBrand(String Brand) {
		this.Brand = Brand;
	}

	public void setseries(String series) {
		this.series = series;
	}

	public void setcapacity(String capacity) {
		this.capacity = capacity;
	}

	public void setweight(int weight) {
		this.weight = weight;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return this.Brand;
	}

	public String getseries() {
		return this.series;
	}

	public String getcapacity() {
		return this.capacity;
	}

	public int getweight() {
		return this.weight;
	}

	public int getprice() {
		return this.price;
	}

}
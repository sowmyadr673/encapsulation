package com.xworkz.encapsulation;

public class HardDisk {

	private String Brand;
	private String series;
	private String capacity;
	private String compatibleDevices;
	private int price;

	private void storeDevice() {
		System.out.println("hard disk used to store devices");
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

	public void setcompatibleDevices(String compatibleDevices) {
		this.compatibleDevices = compatibleDevices;
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

	public int getprice() {
		return this.price;
	}

	public String getcompatibleDevices() {
		return this.compatibleDevices;
	}
}
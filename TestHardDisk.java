package com.xworkz.encapsulation;

public class TestHardDisk {

	public static void main(String[] args) {

		HardDisk HD = new HardDisk();
		HD.setBrand("HP");
		HD.setcapacity("1TB");
		HD.setcompatibleDevices("laptop");
		HD.setseries("HP SSD S550");
		HD.setprice(3800);
		System.out.println("name of the brand:" + HD.getBrand());
		System.out.println("name of the series:" + HD.getseries());
	}

}

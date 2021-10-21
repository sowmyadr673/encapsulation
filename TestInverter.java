package com.xworkz.encapsulation;

public class TestInverter {

	public static void main(String[] args) {

		Inverter inverter = new Inverter();
		inverter.setBrand("Luminous");
		inverter.setcapacity("900VA");
		inverter.setseries("Zolt 1100");
		inverter.setweight(10700);
		inverter.setprice(5600);

		System.out.println("inverter series is " + inverter.getseries());
		System.out.println("inverter capacity is " + inverter.getcapacity());
	}

}

package com.xworkz.encapsulation;

public class SatelliteTest {

	public static void main(String[] args) {

		Satellite SAT = new Satellite();
		SAT.setname("INSAT-3A");
		SAT.setCost(56533345);
		SAT.setType("Geo stationary orbit");
		SAT.setLaunch("12/08/2020");
		SAT.setPlace("Asia-pacific region");
		System.out.println("Recently launched satellite  is " + SAT.getname());
		System.out.println("Approximate cost of the satellite is" + SAT.getCost());
		System.out.println("The satellite is lanched from " + SAT.getPlace());
		System.out.println("The type of satellite is  is" + SAT.getType());
		System.out.println("satellite launch date is " + SAT.getLaunch());
	}

}

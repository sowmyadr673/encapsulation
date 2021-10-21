package com.xworkz.encapsulation;

public class TestSimCard {

	public static void main(String[] args) {

		SimCard sm=new SimCard();
	sm.setsimname("jio");	
	sm.setsimType("micro sim");
	sm.setplan("unlimited voice call for rs 149");
	sm.setvalidity("03-07-2034");
	sm.setprice(246);
	System.out.println("name of the sim is:"+sm.getsimname());
	System.out.println("plan of the sim is:"+sm.getplan());}

}

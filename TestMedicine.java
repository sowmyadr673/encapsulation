package com.xworkz.encapsulation;

public class TestMedicine {

	public static void main(String[] args) {

		Medicine m = new Medicine();
		m.setname("dolo");
		m.setmfd("21-05-2018");
		m.setmg(20);
		m.setexpDate("23-06-2023");
		m.setprice(50);

		System.out.println("medicine name is:" + m.getname());
		System.out.println("medicine manufactured date is:" + m.getmfd());
		System.out.println("medicine mg is:" + m.getmg());
		System.out.println("medicine expire date is:" + m.getexpDate());
		System.out.println("medine price is:" + m.getprice());

	}

}

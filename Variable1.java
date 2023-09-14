package com.corejava.basics;

public class Variable1 {

	static String city="Hyderabad";//static variable
	long contact=9898989898L;//instance variable
	public static void main(String[] args) {
		
		String name="stella"; //local variables
		double age=25;
		char gender='f';
		
		System.out.println(name +"age is:" + age+"gender is:"+gender);
		
		Variable1 obj=new Variable1();//object creation
		
		System.out.println(obj.contact);
		System.out.println(Variable1.city);
	}
	
}



//syso....ctrl+space..enter
//main()...ctrl+space..enter
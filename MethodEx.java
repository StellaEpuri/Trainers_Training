package com.corejava.basics;

public class MethodEx {

	public int add(int a,int b) {//parameterized method
		
		return a+b;
	}
	public String addingNames(String fname,String lname) {
		
		return fname+lname;
	}
	public static void sayHi() {
		
		System.out.println("this is a static method");
	}
	public void displayMsg() {//instance method //default method
		
		System.out.println("this is instance display method");
	}
	public static void main(String[] args) {
		
		System.out.println("This is method example code");

		MethodEx method=new MethodEx();
		method.displayMsg();//accessing instance method
		MethodEx.sayHi();//accessing static method
		System.out.println(method.add(10, 50));
		System.out.println(method.add(100, 550));
		System.out.println(method.add(108, 7950));
		System.out.println(method.addingNames("stella", "Epuri"));
		System.out.println(method.addingNames("sandy", "Epuri"));
		System.out.println(method.addingNames("sanvi", "Epuri"));
	}

}

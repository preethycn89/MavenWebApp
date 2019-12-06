package com.companyname.automobile;
public class Application {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("2 + 2 = " + adder.add(2, 2));
		addmethod();
    }
	public void addmethod()
	{
		System.out.println("Completed Add");
	}
}
package com.companyname.automobile;
public class Application {
    public static void main(String[] args) {
        addmethod();
    }
	public void addmethod()
	{
		Adder adder = new Adder();
        System.out.println("2 + 2 = " + adder.add(2, 2));
	}
}
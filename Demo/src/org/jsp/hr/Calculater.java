package org.jsp.hr;

public class Calculater {
	private int a;
	private int b;
	public Calculater(int a, int b)
	{
		super();
		this.a=a;
		this.b=b;
	}
	public void printAll()
	{
		System.out.println("Summation is : " +(a+b));
		System.out.println("Subtraction is : " +(a-b));
	}

}

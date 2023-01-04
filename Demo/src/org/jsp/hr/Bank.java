package org.jsp.hr;

public class Bank {
	public static double ir=7.8;
}
class Sbi extends Bank
{
	public static void fi(double money)
	{
		Bank b=new Bank();
		double i=money*(1+0.078)-money;
		System.out.println("interst of sbi: "+i);
	}
}

class Main 
{
	public static void main(String[] args) 
	{
		Sbi.fi(885588.5);
	}
}


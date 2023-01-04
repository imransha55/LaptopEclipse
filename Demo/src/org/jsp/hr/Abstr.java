package org.jsp.hr;

abstract class A {
	abstract public void play();
}
abstract class Sample extends A
{
	
}
public class Abstr extends Sample
{ 
	public void play()
{
	System.out.println("hhha");
}
	public static void main(String[] args)
	{
		Abstr a=new Abstr();
		a.play();
	}
}

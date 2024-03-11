package Packages;

public class Base {
	int defvar=20;
	public int pubvar=30;
	private int privar=40;
	protected int provar=50;
	
	 void defMethod()
	{
		System.out.println("Default access Base class");
		System.out.println("Default variale: "+defvar);
	}
	public void pubMethod()
	{
		System.out.println("Public access Base class");
		System.out.println("Public variable: "+pubvar);
	}
	private void priMethod()
	{
		System.out.println("Private access Base class");
		System.out.println("Private variable: "+privar);
	}
	protected void proMethod()
	{
		System.out.println("Protected access Base class");
		System.out.println("Protected variable: "+provar);
	}
}

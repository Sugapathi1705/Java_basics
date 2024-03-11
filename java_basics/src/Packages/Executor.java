package Packages;

public class Executor {
	
	public static void main(String[] args) {
		
		Base a=new Base();
		a.defMethod();
		a.pubMethod();
//		a.priMethod();
		a.proMethod();
		
		a.defvar=100;
		a.defMethod();
		a.pubvar=200;
		a.pubMethod();
//		a.privar=400;
//		a.priMethod();
		a.provar=500;
		a.proMethod();
		System.out.println(a instanceof Base);
		
		
	}

}

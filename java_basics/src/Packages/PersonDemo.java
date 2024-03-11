package Packages;
import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		
		Scanner a=new Scanner(System.in);
		String name,city;
		int age;
		System.out.println("Enter the Person details : Name,age and city");
		name=a.next();
		age=a.nextInt();
		city=a.next();		
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		System.out.println("Person Details");
		System.out.println("Person Name : "+p1.getPersonName());
		System.out.println("Person Age : "+p1.getPersonAge());
		System.out.println("Person City : "+p1.getPersonCity());
		System.out.println("Enter Person Name : ");
		name=a.next();
		System.out.println("Enter Person Age : ");
		age=a.nextInt();
		System.out.println("Enter Person City : ");
		city=a.next();
		p1=new Person(age, name, city);
		{
			System.out.println("Person Name : "+p1.getPersonName());
			System.out.println("Person Age : "+p1.getPersonAge());
			System.out.println("Person City : "+p1.getPersonCity());
			a.close();
		}
		

	}

}

package Packages;
public class Person {
	 private int PersonAge;
	 private String PersonName;
	 private String PersonCity;
	public int getPersonAge() {
		return PersonAge;
	}
	public void setPersonAge(int personAge) {
		PersonAge = personAge;
	}
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public String getPersonCity() {
		return PersonCity;
	}
	public void setPersonCity(String personCity) {
		PersonCity = personCity;
	}
	Person()
	{
		System.out.println("Delfault Constructor INVOKED");
	}
	Person(int age, String name, String city) {
		 System.out.println("Parameterized constructor");
		 this.PersonAge=age;
		 this.PersonName=name;
		 this.PersonCity=city;
    } 
}

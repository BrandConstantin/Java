/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_getters;

/**
 *
 * @author brand
 */
class Person {

	//instance variable
	String name;
	int age;

	//methods
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
//		System.out.println(yearsLeft);

		return yearsLeft;
	}

	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}
}

public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 23;

//		System.out.println(person1.name);

		int years = person1.calculateYearsToRetirement();
		int age = person1.getAge();
		String name = person1.getName();

		System.out.println("Years till retirements " + years);
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
	}

}

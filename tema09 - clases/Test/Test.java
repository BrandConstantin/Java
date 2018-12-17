/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author brand
 */
class Person {
	//instance variable
	String name;
	int age;	
	
	//methods
	void speak(){
		System.out.println("Hello");
	}
	
	void presentation(){
		System.out.println("My name is " + name.substring(0, 3));
	}
}

public class Test{
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name= "Joe Bloggs";
		person1.age = 23;
		
		System.out.println(person1.name);
		
		person1.speak();
		person1.presentation();
	}	
}

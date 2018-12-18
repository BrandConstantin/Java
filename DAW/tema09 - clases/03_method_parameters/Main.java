/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_method_parameters;

/**
 *
 * @author brand
 */
class Robot{
	public void speak(String text){
		System.out.println(text);
	}
	
	public void jump(int height){
		System.out.println("Jumping " + height);
	}
	
	public void move(String direction, double distance){
		System.out.println("Moving " + distance + " metres in direction " + direction);
	}
}

public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hi I'm Sam");
		sam.jump(5);
		sam.move("west", 10);
	}
	
}

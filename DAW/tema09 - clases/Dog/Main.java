import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog("Layla", 2);
		
		d.bark();
		
		int dogYears = d.getDogYears();
		System.out.println(d.name + " have " + dogYears + " years.");
		
		d.fetch();
		d.fetch();
		d.fetch();
		d.fetch();
		d.fetch();
	}
}

class Frog{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
}

public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog();
		
//		frog1.name;
//		frog1.age = 1;
		
		frog1.setName("Bertie");
		frog1.setAge(3);
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
	}

}

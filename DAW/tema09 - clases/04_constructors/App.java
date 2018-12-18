class Machine{
	private String name;
	
	public Machine() {
		System.out.println("Constructor running!");
		
		name = "Arnie";
	}
	
	public Machine(String name) {
		System.out.println("Second constructro running!");
		this.name = name;
	}
}

public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		
		new Machine();
		
		Machine machine2 = new Machine("Bertie");
	}
}


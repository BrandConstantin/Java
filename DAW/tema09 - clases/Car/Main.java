import java.awt.Color;
import java.net.SocketTimeoutException;

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car(25.5, "1BCD34", Color.blue, true);
		
		System.out.println(myCar.paintColor);
		System.out.println(myCar.licensePlate);
		
		myCar.changePaintColor(Color.RED);
		
		System.out.println(myCar.paintColor);
	}
}

import java.awt.*;

public class Car {
	double averageMilesPerGallon;
	String licensePlate;
	Color paintColor;
	boolean areTailingWorking;
	
	// constructor
	public Car(double inputAverageMPG, String inputLicensePlate, Color inputPaintColor, boolean inputAreTailingWorking) {
		this.averageMilesPerGallon = inputAverageMPG;
		this.licensePlate = inputLicensePlate;
		this.paintColor = inputPaintColor;
		this.areTailingWorking = inputAreTailingWorking;
	}
	
	public void changePaintColor(Color newPaintColor) {
		this.paintColor = newPaintColor;
	}
	
	//using call by value
	public void speedingUp(double currentSpeed) {
		currentSpeed += 100;			
	}
	
	//using call by reference
	public double speedingDown(double currentSpeed) {
		currentSpeed -= 20;	
		
		return currentSpeed;
	}
}

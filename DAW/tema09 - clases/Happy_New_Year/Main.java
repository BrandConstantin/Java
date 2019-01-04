import java.text.SimpleDateFormat;
import java.util.Calendar;

class Beber{
	boolean year_2018;
	int hour;
	String[] drink = {"Whiskey", "Gin", "Wine"};
	private int fetchCounter = 0;
	
	public Beber(boolean year_2018, int hour) {
		this.year_2018 = year_2018;
		this.hour = hour;
	}
	
	public String getHour() {
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return ( sdf.format(cal.getTime()) );
	}
	
	public void fetch() {
		this.fetchCounter = (this.fetchCounter + 1) % 3;
		String item = this.drink[this.fetchCounter];
		System.out.println("Drink: " + item);
	}
}

public class Main {
	public static void main(String[] args) {
		Beber d = new Beber(false, 2);
		
		String hour = d.getHour();
		
		while(!hour.equals("00:00:00")) {
			d.fetch();			
		}
		
		if(hour.equals("00:00:00")) {
			System.out.println("Happy New Year!");
		}
	}
}

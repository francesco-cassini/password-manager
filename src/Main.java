import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		KeyRecord database = new KeyRecord();
		
		database.addRecord("pippo", "1234", "www.soulpixel.it");
		database.addRecord("pluto", "4567", "www.soulpixel.it");
		database.addRecord("paperino", "9631", "www.soulpixel.it");
		
		database.getRecords();
		
		

	}

}

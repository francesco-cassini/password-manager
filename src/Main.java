public class Main {

	public static void main(String[] args) {

		String user = "fca";
		String psw = "12334";
		Login login = new Login();
		
		KeyRecord database = new KeyRecord();
		
		database.addRecord("pippo", "1234", "www.soulpixel.it");
		database.addRecord("pluto", "4567", "www.soulpixel.it");
		database.addRecord("paperino", "9631", "www.soulpixel.it");
		
		if (login.auth()) {
			
			database.getRecords();
			
		}	

		

	}

}

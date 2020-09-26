public class Main {

	public static void main(String[] args) {

		LocalDatabase db = new LocalDatabase();	
		
		if (new Login() != null) {
			
			db.getRecords();
			
			db.addRecord("Gino", "4444", "www.fra.com");
			
			db.saveDB();

		}	

		

	}

}

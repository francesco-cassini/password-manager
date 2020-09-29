public class Main {

	public static void main(String[] args) {

		LocalDatabase db = new LocalDatabase();	
		
		if (new Login() != null) {
			
			db.getRecords();
			
			db.saveDB();

		}	

		

	}

}

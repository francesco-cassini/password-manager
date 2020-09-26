import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

class LocalDatabase {

	private int i = 0;
	private KeyRecord database = new KeyRecord();
	private Scanner scan = null;

	LocalDatabase(){
		
		openFile();
		readDB();
		
		}

	private void openFile() {

		try {
			scan = new Scanner(new File(".\\DB.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void readDB() {

		String line;

		while (scan.hasNext()) {

			line = scan.nextLine();

			String[] splitted = line.split("-");

			database.addRecord(splitted[i], splitted[i + 1], splitted[i + 2]);

		}
	}

	public void getRecords() {
		
		database.getRecords();
	
	}
	
	public void addRecord(String user, String psw, String url) {
		
		database.addRecord(user, psw, url);
		
	}
	
	public void saveDB() {
		
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(new File(".\\DB.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.print("");
		
		writer.print(database.getRecord());
		
		writer.close();
		
	}
		

}

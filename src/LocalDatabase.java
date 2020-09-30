import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

class LocalDatabase {

	private int i = 0;
	private KeyRecord database = new KeyRecord();
	private Scanner scan = null;
	String[] record;

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
		
		record = database.getRecordToFile();
	}

	public void printRecords() {
		
		for(int i = 0; i < record.length; i++){
			
			System.out.println((i+1)+") "+record[i]);
			
		}
	
	}
	
	public void addRecord(String user, String psw, String url) {
		
		database.addRecord(user, psw, url);
		record = database.getRecordToFile();
		
	}
	
	public void deleteRecord(int i) {
		
		database.deleteRecord(i);
		record = database.getRecordToFile();
		
	}
	
	public void saveDB() {
		
		PrintWriter writer = null;
		record = database.getRecordToFile();
		
		try {
			writer = new PrintWriter(new File(".\\DB.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String s : record) {
		writer.print(s+"\n");
		}
		
		writer.close();
		
	}
		

}

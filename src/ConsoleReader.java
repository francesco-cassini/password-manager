import java.util.Scanner;

public class ConsoleReader {
	
	
	private static Scanner reader;
	
	public ConsoleReader() {
		
		reader = new Scanner(System.in);
		
	}
	
	
	public static String read() {
		
		return reader.nextLine();
		
	}
	
	public static void endReading() {
		
		reader.close();
		
	}

	public static boolean hasNext() {
		
		return reader.hasNext();
		
	}
}

public class Main {

	public static void main(String[] args) {
		
		new ConsoleReader();
		
		if (new Login().auth() != false) {
		
		
		new ProgramManager();

		}	

		ConsoleReader.endReading();
		

	}

}


public class ProgramManager {
	
	LocalDatabase db = new LocalDatabase();	
	String inpUser = "0";
	String[] inpUser_str;
	
	public ProgramManager() {
		
		inpUser_str = new String[3];
	    
		while(Integer.parseInt(inpUser) != 5) {
			
			System.out.println("Francesco Cassini - Password Manager: \n"
					+ "1) Show stored passwords\n"
					+ "2) Add new entry\n"
					+ "3) Delete an entry\n"
					+ "4) Save\n"
					+ "5) Exit");
		    System.out.println("#Insert option: \n");
		    
		    inpUser = ConsoleReader.read();
		    
			System.out.println("############ OUTPUT ############");
		    
		    switch (Integer.parseInt(inpUser)) {
		    
			    case 1: {
			    db.printRecords();
			    break;
			    }
			    
			    case 2: {
				System.out.println("#Insert user: \n");
				inpUser_str[0] = ConsoleReader.read();
				System.out.println("\n#Insert password: \n");
				inpUser_str[1] = ConsoleReader.read();
				System.out.println("\n#Insert url: \n");
				inpUser_str[2] = ConsoleReader.read();
			    db.addRecord(inpUser_str[0], inpUser_str[1], inpUser_str[2]);
			    
			    db.printRecords();
			    break;
			    
			    }
			    
			    case 3: {
				System.out.println("#Which entry you want delete: \n");
				inpUser_str[0] = ConsoleReader.read();
				db.deleteRecord(Integer.parseInt(inpUser_str[0]));
			    		
			    break;
			    }
			    
			    case 4: {
			    db.saveDB();
			    break;
			    }
			    
			    case 5: {
			    System.exit(0);
			    break;
			    }
		    }
		    
		    System.out.println("################################\n");
		}
		

	    
	}
	

	    
}

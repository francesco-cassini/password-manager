import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class Login {
	
	private String user;
	private String password;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Login() {
		
		auth();
		
	}
	
	private Boolean auth() {
		
		    Scanner scan = null;
			try {
				scan = new Scanner (new File(".\\Login.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    setUser(scan.nextLine());
		    setPassword(scan.nextLine()); // looks at selected file in scan

		    Scanner keyboard = new Scanner (System.in);
		    System.out.println("#Insert user: ");
		    String inpUser = keyboard.nextLine();
		    System.out.println("#Insert password: ");
		    String inpPass = keyboard.nextLine(); // gets input from user
		    keyboard.close();

		    if (inpUser.equals(getUser()) && inpPass.equals(getPassword())) {
		        System.out.print("\n### Login success ### \n");
		        return true;
		    } else {
		        System.out.print("\n### Error ### \n");
		        return false;
		    }
		    
		
	}


}

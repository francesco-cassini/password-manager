
public class Key {
	
	/*Getter and Setter*/
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getPsw() {
		return psw.getPsw();
	}

	public void setPsw(String psw) {
		this.psw = new Password(psw);
	}

	private String user;
	private Password psw;
	private String url;
	
	/*Costruttore*/
	
	public Key(String user, String psw, String url)
	{
		setPsw(psw);
		setUser(user);
		setUrl(url);
		
	}

	
	
	@Override
	public String toString() {
		return "User: " + getUser() + " - Password: " + getPsw() + " - URL: " + getUrl();
	}
		

}

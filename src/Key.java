
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

	/*public void setPsw(Password psw) {
		this.psw = psw;
	}*/

	private String user;
	private Password psw;
	private String url;
	
	/*Costruttore*/
	
	public Key(String user, String psw, String url)
	{
		this.psw = new Password(psw);
		setUser(user);
		setUrl(url);
		
	}

	
	
	@Override
	public String toString() {
		return "Key [getUser()=" + getUser() + ", getPsw()=" + getPsw() + ", getUrl()=" + getUrl() + "]";
	}
		

}

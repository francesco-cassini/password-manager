import java.util.ArrayList;

public class KeyRecord {
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNum_key() {
		return num_key;
	}

	public void setNum_key(int num_key) {
		this.num_key = num_key;
	}

	private String nome;
	private int num_key;
	private ArrayList<Key> record;
	
	public KeyRecord() {
		
		 record = new ArrayList<Key>();
		
	}
	
	
	public void addRecord(String user, String psw, String url) {
		
		record.add(new Key(user, psw, url));
		
	}
	
	public void getRecords() {
		
		for(Key k : record){
			
			System.out.println("User: "+k.getUser()+" - Psw: "+k.getPsw()+" - Url: "+k.getUrl()+"\n");
			
		}
		
	}


}

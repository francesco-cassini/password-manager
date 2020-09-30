import java.util.ArrayList;

public class KeyRecord {

	private String nome;
	private int num_key;
	private ArrayList<Key> record;
	
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


	public KeyRecord() {
		
		 record = new ArrayList<Key>();
		
	}
	
	public void addRecord(String user, String psw, String url) {
		
		record.add(new Key(user, psw, url));
		
	}
	
	public void deleteRecord(int i) {
		
		record.remove(i-1);
		
	}
	
	
	public String[] getRecordToFile() {
		
		String[] record_file = new String[record.size()];
		
		for (int i = 0; i < record.size(); i++) {
			
			record_file[i] = record.get(i).getUser()+"-"+record.get(i).getPsw()+"-"+record.get(i).getUrl();
			
		}
		
		return record_file;

	}


}

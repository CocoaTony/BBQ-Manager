package project;

public class Table_ID {
	private String ID;
	private String table_Status;
	
	
	public Table_ID(String iD, String table_Status) {
		super();
		ID = iD;
		this.table_Status = table_Status;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTable_Status() {
		return table_Status;
	}

	public void setTable_Status(String table_Status) {
		this.table_Status = table_Status;
	}

	public static void find_Table (String ID) {
		
	}
	
}

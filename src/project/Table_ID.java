package project;

public class Table_ID {
	private String iD;
	private String table_Status;
	
	public Table_ID(String iD, String table_Status) {
		super();
		setID(iD);
		setTable_Status(table_Status);
	}

	public String getID() {
		return iD;
	}

	public void setID(String iD) {
		if(iD.isEmpty()) {
			System.out.println("Invalid ID");
		}else;
		this.iD = iD;
	}

	public String getTable_Status() {
		return table_Status;
	}

	public void setTable_Status(String table_Status) {
		this.table_Status = table_Status;
	}

	@Override
	public String toString() {
		return "Table_ID [iD=" + iD + ", table_Status=" + table_Status + "]";
	}

	
	
}

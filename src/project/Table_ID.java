package project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Table_ID {
	private static String iD;
	private String table_Status;
	
	
	public Table_ID(String iD, String table_Status) {
		super();
		this.iD = iD;
		this.table_Status = table_Status;
	}

	public String getID() {
		return iD;
	}

	public void setID(String iD) {
		this.iD = iD;
	}

	public String getTable_Status() {
		return table_Status;
	}

	public void setTable_Status(String table_Status) {
		this.table_Status = table_Status;
	}

	public static void find_Table (String id) throws IOException{
		String table = "table";
		File table1 = new File(table);
		if(table1.exists()) {
			String[] booking = table1.list();
			String Stat = booking.toString();
			Scanner reader = new Scanner(new File(table+"/"+booking));
		}
	}
	
}

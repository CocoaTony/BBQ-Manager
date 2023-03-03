package fortest;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndRead extends ReadFile {
	public String table;
	public String menu;
	public String pricemenu;
	
	public void WriteFile(String table,String menu,String pricemenu) throws IOException {
		FileWriter writer = new FileWriter("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\Bill.txt",true);
		writer.write("\n"+table+" "+menu+" "+pricemenu);
		writer.close();
	}
	
	
	
	
	
	public FileWriterAndRead() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}




	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}




	public String getPricemenu() {
		return pricemenu;
	}
	public void setPricemenu(String pricemenu) {
		this.pricemenu = pricemenu;
	}
	
	
	
}

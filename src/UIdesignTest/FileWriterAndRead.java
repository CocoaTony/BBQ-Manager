package UIdesignTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndRead extends ReadFile {
	public String table;
	public String menu;
	public String pricemenu;
	
	
	public void WriteFileMenu(String table,String Menu,int price) throws IOException {
		FileWriter writer = new FileWriter("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\Bill.txt",true);
		writer.write(table+" "+Menu+" "+price+"\n");
		writer.close();
	}
	
	public boolean checkWaMeTableMai() {
		File file = new File("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\Bill.txt");
		boolean result = true;
		if(file.length() == 0) {
			result = true;
		}else if(file.length() >0) {
			result = false;
		}
		return result;
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

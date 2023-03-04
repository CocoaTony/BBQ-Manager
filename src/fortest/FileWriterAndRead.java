package fortest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndRead extends ReadFile {
	public String table;
	public String menu;
	public String pricemenu;
	
	public void WriteFileBill(String table,String menu,String pricemenu) throws IOException {
		FileWriter writer = new FileWriter("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\Bill.txt",true);
		writer.write("\n"+table+" "+menu+" "+pricemenu);
		writer.close();
	}
	
	public void WriteFileMenu(String nameMenu,int price) throws IOException {
		File file = new File("/JAVA-OOP-Project/data/Menu.txt");
		if(file.exists() == false) {
			FileWriter writer = new FileWriter("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\Menu.txt",true);
			writer.write(nameMenu+" "+price+"\n");
			writer.close();
		}
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

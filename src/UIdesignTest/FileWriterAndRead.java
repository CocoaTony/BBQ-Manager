package UIdesignTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import project.Booking;

public class FileWriterAndRead extends ReadFile {
	public String table;
	public String menu;
	public String pricemenu;
	
	//Booking A
	private String nameBK;
	private String time_s;
	private String time_e;
	private String tableID;
	private String phone;
	static int numID;
	
	
	
	
	public void WriteFileMenu(String table,String Menu,int price) throws IOException {
		FileWriter writer = new FileWriter("data\\Bill.txt",true);
		writer.write(table+" "+Menu+" "+price+"\n");
		writer.close();
	}
	
	public boolean checkWaMeTableMai() {
		File file = new File("data\\Bill.txt");
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
	
	
	
	
	//Booking Section
	public String getNameBK() {
		return this.nameBK;
	}
	public void setNameBK(String name) {
		if (name.isEmpty()) {
			this.nameBK = "Customer for table "+this.table;
		} else this.nameBK = name;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		if (phone.isEmpty()) {
			this.phone = "Unknow";
		}
		else this.phone = phone;
	}
	public String getTableID() {
		return tableID;
	}
	public void setTableID(String tableID) {
		this.tableID = tableID;
	}
	public static int getNumID() {
		return numID;
	}
	public static void setNumID() {
		FileWriterAndRead.numID++;
	}
	
	public String getTime_s() {
		return this.time_s;
	}
	public void setTime_s(String time_s) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("HH:mm");
		Date t1 = date.parse(time_s);
		this.time_s = date.format(t1);
	}
	public String getTime_e() {
		return this.time_e;
	}
	public void setTime_e(String time_e) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("HH:mm");
		Date t1 = date.parse(time_e);
		this.time_e = date.format(t1);
	}
	public void BKFile() throws IOException {
		File tb = new File("data/tableID");
		if(!tb.exists()){
			tb.mkdirs();
		}
	}
	public void wfbk() throws IOException {
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		FileWriter write = new FileWriter("data/booking.txt", true);
		write.append(getNumID()+" "+getNameBK()+" "+getPhone()+" "+getTableID()+" "+getTime_s()+"-"+getTime_e()+" "+date.format(new Date())+"\n");
		FileWriter write_table = new FileWriter("data/tableID/"+getTableID()+".txt", true);
		write_table.append(getTime_s()+"-"+getTime_e()+"\n");
		write.close();
		write_table.close();
	}
	
	public String[] readTable() {
		File tb = new File("data/bill");
		int i = 0;
		String[] tbList = tb.list();
		String[] tbName = new String[tbList.length];
		for (String s : tbList) {
			String[] sp = s.split("\\.");
			tbName[i] = sp[0];
			i++;
		}
		return tbName;
	}
	
	public Object[] readF(String fileName) throws FileNotFoundException {
		File file = new File("data/tableID/"+fileName+".txt");
		ArrayList<String> ct = new ArrayList<>();
		if (file.exists()) {
			Scanner scan = new Scanner(file);
			
			while (scan.hasNext()) {
				ct.add(scan.nextLine());
			}
			return ct.toArray();
		}else {
			return ct.toArray();
		}
		
	}
	
	//Order Section
	public void order(String table, String menu, String price, String count) throws IOException {
		File dir = new File("data/bill");
		if (dir.exists()) {
			dir.mkdir();
		}
		FileWriter f = new FileWriter("data/bill/"+table+".txt",true);
		f.append(menu+"\t"+price+"\t"+count+"\n");
		f.close();
	}
	
	
}

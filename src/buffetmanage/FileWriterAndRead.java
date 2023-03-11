package buffetmanage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


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
	
	
	
	//Write file for menu
	public void WriteFileMenu(String table,String Menu,int price) throws IOException {
		FileWriter writer = new FileWriter("data/Bill.txt",true);
		writer.write(table+" "+Menu+" "+price+"\n");
		writer.close();
	}
	
	//Table checking for bill check
	public boolean checkTable() {
		File file = new File("data/Bill.txt");
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
	public String getNameBook() {
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
	
	
	//Make table directory by ID
	public void bookFile() throws IOException {
		File tb = new File("data/tableID");
		if(!tb.exists()){
			tb.mkdirs();
		}
	}
	
	//write booking and order file for saving data and make bill order work
	public void writeBookFile() throws IOException {
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		FileWriter write = new FileWriter("data/booking.txt", true);
		FileWriter write02 = new FileWriter("data/Order.txt",true);
		write.append(getNumID()+" "+getNameBook()+" "+getPhone()+" "+getTableID()+" "+getTime_s()+"-"+getTime_e()+" "+date.format(new Date())+"\n");
		write02.append(getNumID()+" "+getNameBook()+" "+getPhone()+" "+getTableID()+" "+getTime_s()+"-"+getTime_e()+" "+date.format(new Date())+"\n");
		FileWriter write_table = new FileWriter("data/tableID/"+getTableID()+".txt", true);
		write_table.append(getTime_s()+"-"+getTime_e()+"\n");
		write.close();
		write_table.close();
		write02.close();
	}
	
	//Find table to order food
	public String[] readTable() {
		File table = new File("data/tableID");
		int i = 0;
		String[] tbList = table.list();
		String[] tbName = new String[tbList.length];
		for (String s : tbList) {
			String[] sp = s.split("\\.");
			tbName[i] = sp[0];
			i++;
		}
		return tbName;
	}
	
	//read order to make bill check
	public String[] readBill() {
		File table = new File("data/bill");
		int i = 0;
		String[] tbList = table.list();
		String[] tbName = new String[tbList.length];
		for (String s : tbList) {
			String[] sp = s.split("\\.");
			tbName[i] = sp[0];
			i++;
		}
		return tbName;
	}
	
	//Find food to make bill
	public Object[] readFood(String fileName) throws FileNotFoundException {
		File file = new File("data/tableID/"+fileName+".txt");
		ArrayList<String> food_List = new ArrayList<>();
		if (file.exists()) {
			Scanner scan = new Scanner(file);
			
			while (scan.hasNext()) {
				food_List.add(scan.nextLine());
			}
			return food_List.toArray();
		}else {
			return food_List.toArray();
		}
		
	}
	
	//Write bill file to save order
	public void writeOrderFile(String table, String menu, String price, String count) throws IOException {
		File dir = new File("data/bill");
		if (dir.exists()) {
			dir.mkdir();
		}
		FileWriter f = new FileWriter("data/bill/"+table+".txt",true);
		f.append(menu+"\t"+price+"\t"+count+"\n");
		f.close();
	}
	
	
	//Print Bill check by file in bill.txt
	public Object[] showBill (String fileName) throws FileNotFoundException {
		ArrayList<String> name = new ArrayList<>();
//		ArrayList<String> price = new ArrayList<>();
//		ArrayList<String> count = new ArrayList<>();
		Scanner scan = new Scanner(new File("data/bill/"+fileName+".txt"));
		while(scan.hasNext()) {
			String[] n = scan.nextLine().split("\t");
			name.add(n[0]);
//			price.add(n[1]);
//			count.add(n[2]);
		}
		scan.close();
		return name.toArray();
		
		
	}
	
	//Get price and make it show on bill check
	public Object[] showBillprice (String fileName) throws FileNotFoundException {
//		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> price = new ArrayList<>();
//		ArrayList<String> count = new ArrayList<>();
		Scanner scan = new Scanner(new File("data/bill/"+fileName+".txt"));
		while(scan.hasNext()) {
			String[] n = scan.nextLine().split("\t");
//			name.add(n[0]);
			price.add(n[1]);
//			count.add(n[2]);
		}
		scan.close();
		return price.toArray();
		
		
	}
	
	//Count bill to make it show on check bill panel
	public Object[] countBill (String fileName) throws FileNotFoundException {
//		ArrayList<String> name = new ArrayList<>();
//		ArrayList<String> price = new ArrayList<>();
		ArrayList<String> count = new ArrayList<>();
		Scanner scan = new Scanner(new File("data/bill/"+fileName+".txt"));
		while(scan.hasNext()) {
			String[] n = scan.nextLine().split("\t");
//			name.add(n[0]);
//			price.add(n[1]);
			count.add(n[2]);
		}
		scan.close();
		return count.toArray();
		
		
	}
	
	
	
	
	//get price and make total
	public int totalPrice (String fileName) throws FileNotFoundException {
//		ArrayList<String> name = new ArrayList<>();
//		ArrayList<String> price = new ArrayList<>();
//		ArrayList<String> count = new ArrayList<>();
		Scanner scan = new Scanner(new File("data/bill/"+fileName+".txt"));
		int total = 0;
		while(scan.hasNext()) {
			String[] n = scan.nextLine().split("\t");
//			name.add(n[0]);
//			price.add(n[1]);
//			count.add(n[2]);
			
			total += Integer.parseInt(n[1]) * Integer.parseInt(n[2]);
		}
		scan.close();
		return total;
		
		
	}
	
	//delete bill file after check bills
	public void deleteBillFile(String fileName) {
//		File ftb = new File("data/tableID/"+fileName+".txt");
//		ftb.delete();
		File fbill = new File("data/bill/"+fileName+".txt");
		fbill.delete();
	}
	
	//delete Order after add food on order panel
	public void deleteOrderBooking(int index) throws IOException {
		Scanner scan = new Scanner(new File("data/Order.txt"));
		int count = 0;
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();
		ArrayList<String> d = new ArrayList<String>();
		ArrayList<String> f = new ArrayList<String>();
		ArrayList<String> g = new ArrayList<String>();
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] group = line.split(" ");
			for(int i =0;i<1;i++) {
				a.add(group[i]);
				b.add(group[i+1]);
				c.add(group[i+2]);
				d.add(group[i+3]);
				f.add(group[i+4]);
				g.add(group[i+5]);
			}
		}
		scan.close();
		a.remove(index);
		b.remove(index);
		c.remove(index);
		d.remove(index);
		f.remove(index);
		g.remove(index);
		
		try {
			FileWriter writer = new FileWriter("data/Order.txt");
			for(int i = 0;i<a.size();i++) {
				writer.write(a.get(i)+" ");
				writer.write(b.get(i)+" ");
				writer.write(c.get(i)+" ");
				writer.write(d.get(i)+" ");
				writer.write(f.get(i)+" ");
				writer.write(g.get(i)+"\n");
			}
			writer.close();
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	//Check dir and make Order.txt
	public void checkDir() throws IOException {
		File data = new File("data");
		File bill = new File("data/bill");
		File table = new File("data/tableID");
		
		if (!data.exists()) {
			data.mkdir();
			new FileWriter("data/Order.txt", true).append("no "+"name "+"phone "+"table "+"timeselect "+"date "+"time"+"\n").close();
		}
		if (!bill.exists()) {
			bill.mkdir();
		}
		if (!table.exists()) {
			table.mkdir();
		}
	}
	
	//make total
	public void pricetotal(String t) throws IOException {
		FileWriter file = new FileWriter("data/total.txt",true);
		file.append(t);
		file.close();
	}
	
	//delete file after close store
	public void closeStore() {
		 File tb = new File("data/tableID");
		 String[]fileList = tb.list();
		 for (String string : fileList) {
			new File("data/tableID/"+string).delete();
		}
		 new File("data/booking.txt").delete();
		 new File("data/total.txt").delete();
		 
		 File bill = new File("data/bill");
		 String[]billList = bill.list();
		 for (String string : billList) {
			 new File("data/bill/"+string).delete();
		 }
	}
	
}

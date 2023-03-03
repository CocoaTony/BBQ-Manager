package project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Booking {
	
	private String name;
	private String time_s;
	private String time_e;
	private String table;
	private String phone;
	static int numID;
	
	public Booking(String name, String phone, String table, String time_s, String time_e) throws ParseException {
		setName(name);;
		setPhone(phone);
		setTable(table);
		setTime_s(time_s);
		setTime_e(time_e);
		setNumID();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.isEmpty()) {
			this.name = "Customer for table "+this.table;
		} else this.name = name;
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
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public static int getNumID() {
		return numID;
	}
	public static void setNumID() {
		Booking.numID++;
	}
	
	public String getTime_s() {
		return time_s;
	}
	public void setTime_s(String time_s) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("HH:mm");
		Date t1 = date.parse(time_s);
		this.time_s = date.format(t1);
	}
	public String getTime_e() {
		return time_e;
	}
	public void setTime_e(String time_e) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("HH:mm");
		Date t1 = date.parse(time_e);
		this.time_e = date.format(t1);
	}
	public void writeFile() throws IOException {
		
		File file = new File("data/booking.txt");
		if (file.exists()) {
			wf();
		}else {
			new File("data").mkdir();
			wf();
		}
	}
	public void wf() throws IOException {
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		FileWriter write = new FileWriter("data/booking.txt", true);
		write.append(getNumID()+"\t"+getName()+"\t"+getPhone()+"\t"+getTable()+"\t"+getTime_s()+"-"+getTime_e()+"\t"+date.format(new Date())+"\n");
		write.close();
	}

}

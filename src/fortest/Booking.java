package fortest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
	private String name;
	private String time;
	private String table;
	private String phone;
	static int numID;
	
	public Booking(String name, String phone, String table, String time) throws ParseException {
		setName(name);;
		setPhone(phone);
		setTable(table);
		setTime(time);
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("HH:mm");
		Date t1 = date.parse(time);
		this.time = date.format(t1);
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
	
	public void writeFile() throws IOException {
		
		File file = new File("testdata/booking.txt");
		if (file.exists()) {
			wf();
		}else {
			new File("testdata").mkdir();
			wf();
		}
		
	}
	public void wf() throws IOException {
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		FileWriter write = new FileWriter("testdata/booking.txt", true);
		write.append(getNumID()+"\t"+getName()+"\t"+getPhone()+"\t"+getTable()+"\t"+getTime()+"\t"+date.format(new Date())+"\n");
		write.close();
	}
	
	
}

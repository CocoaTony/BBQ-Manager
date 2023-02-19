package fortest;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Func {
	public static void Booking() throws IOException, ParseException {
//		SimpleDateFormat date1 = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your name: ");
		String name = scan.nextLine();
		System.out.print("Pick Table: ");
		String table = scan.nextLine();
		System.out.print("Enter Phone Number: ");
		String phone = scan.nextLine();
		System.out.print("Enter Time [Ex. 13.00 Enter 13:00]: ");
		String time = scan.nextLine();
		scan.close();
		
//		String time = date.format(new Date());
		
		Booking bk = new Booking(name,phone,table,time);
//		bk.setName(name);
//		bk.setPhone(phone);
//		bk.setTable(table);
//		bk.setTime(time);
		
		System.out.println(bk.getName());
		System.out.println(bk.getPhone());
		System.out.println(bk.getTable());
		System.out.println(bk.getTime());
		
		bk.writeFile();
	}
	
	public static void Display() {
		System.out.println();
	}
}

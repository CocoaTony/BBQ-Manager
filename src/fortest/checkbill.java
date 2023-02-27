package fortest;

import java.io.File;
import java.util.Scanner;

public class checkbill {
	public static void main(String[] arg) throws Exception {
		Scanner scan = new Scanner(System.in);
		File dir = new File("ordertest");
		String[] dir_list = dir.list();
		System.out.println("=== Choose table ===");
		for(int i=0;i<dir_list.length;i++) {
			System.out.println((i+1)+". "+dir_list[i]);
		}
		System.out.println("Choose table");
		String table_name = scan.nextLine();
		System.out.printf("=== Content of %s ===\n",table_name);
		Scanner scan1 = new Scanner(new File(dir+"/"+table_name));
		if(scan1.hasNext()) {
			String line = scan1.nextLine();
			System.out.println(line);
			String[] list = line.split("\t");
			int people_person = Integer.parseInt(list[2]);
			int price_per_person = Integer.parseInt(list[3]);			
			System.out.printf("Total price:\t%d",people_person*price_per_person);
		}
		
	}
}

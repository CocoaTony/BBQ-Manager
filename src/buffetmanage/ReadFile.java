package buffetmanage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	private String[] name;
	private int[] price;
	


	//For Size in method getList*****
	public int count(String location) throws IOException{
		int check =0;
		int count1 = 0 ;
		Scanner scan = new Scanner(new File(location));
		while(scan.hasNext()){
			scan.nextLine();
			if(check == 0) {
				check = 1;
			}else{
				count1 +=1;
			}
		}
		scan.close();
		return count1;
	}
	
	//Main Method in FucList_FOOD*****
	public String[] getList(int numberCommand,String location) throws IOException {
		File file = new File(location);
		if(file.exists() == false) {
			String[] list = new String[] {};
			return list ;
		}else {
			Scanner scan = new Scanner(new File(location));
			int check = 0;
			int count = -1;
			String[] list = new String[count(location)];
			while(scan.hasNext()){
				String line = scan.nextLine();
				String[] ListForLength = line.split(" ");
				for(int i = 0;i<ListForLength.length;i++) {
					if(check == 0){
						check += 1;
					}
					else{
						if(i ==0) {
							count += 1;
							list[count] = ListForLength[numberCommand-1];
						}
					}
				}
			}
			scan.close();
			return list;
		}
	}
	
	//*String[] to Int[]
	public int[] StringtoInt(int numberCommand,String location) throws IOException {
		String[] List = getList(numberCommand,location);
		int[] LISTisINT = new int[count(location)];
		for(int i = 0;i<List.length;i++) {
			String Index = List[i];
			LISTisINT[i] = Integer.parseInt(Index);
		}
		return LISTisINT;
	}
	
	//List Index
	public String[] getName() {
		return name;
	}
	public void setName(int AddressINdata,String location) throws IOException {
		this.name = getList(AddressINdata,location);
		
	}
	
	//Price
	public int[] getPrice() {
		return price;
	}
	
	public void setPrice(int AddressINdata,String location)throws IOException {
		this.price = StringtoInt(AddressINdata,location);
	}
	
	
	public String priceFood(String menuName) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("food.txt"));
		String price = "";
		while (scan.hasNext()) {
			String[] mn = scan.nextLine().split(" ");
			if (menuName.equals(mn[0])) {
				price = mn[1];
			}
			
		}
		return price;
	}
	
	public int totalPrice() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("data/total.txt"));
		int total = 0;
		while (scan.hasNext()) {
			String n = scan.nextLine();
			if (n != "") {
				total = total + Integer.parseInt(n);
			}
			
		}
		return total;
	}
	
	

}

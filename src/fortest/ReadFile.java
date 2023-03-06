package fortest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	private String[] name;
	private int[] price;
	


	//For Size in method getList*****
	public int count(String location) throws IOException{
		int count1 = 0 ;
		int check = 0;
		Scanner scan = new Scanner(new File(location));
		while(scan.hasNext()){
			scan.nextLine();
			if(check == 0) {
				check +=1;
				continue;
			}else {
				count1 += 1;
			}
		}
		scan.close();
		return count1;
	}
	
	//Main Method in FucList_FOOD*****
	public String[] getList(int numberCommand,String location) throws IOException {
		Scanner scan = new Scanner(new File(location));
		int count = -1;
		int check = 0;
		String[] list = new String[count(location)];
		while(scan.hasNext()){
			String line = scan.nextLine();
			String[] ListForLength = line.split(" ");
			for(int i = 0;i<ListForLength.length;i++) {
				if(check == 0){
					check += 1;
					continue;
				}else {
					if(i==0) {
						count += 1;
						list[count] = ListForLength[numberCommand - 1];
					}
				}
			}
		}
		scan.close();
		return list;
		
	}
	
	//*String[] to Int[]
	public int[] StringtoInt(int numberCommand,String location) throws IOException {
		String[] List = getList(numberCommand,location);
		int[] LISTisINT = new int[count(location)];
		for(int i = 0;i<List.length;i++) {
			String Index = List[i];
			LISTisINT[i] =  Integer.parseInt(Index);
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
	
	
	
	
	

}

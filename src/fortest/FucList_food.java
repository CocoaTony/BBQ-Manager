package fortest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FucList_food {
	private String[] nameFood;
	private int[] price;
	private int[] quantity;
	
	
	//For Size in method getList*****
	public int count() throws IOException{
		int count1 = 0 ;
		int check = 0;
		Scanner scan = new Scanner(new File("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\food.txt"));
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
	public String[] getList(int numberCommand) throws IOException {
		Scanner scan = new Scanner(new File("C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\food.txt"));
		int check = 0;
		String[] list = new String[count()];
		while(scan.hasNext()){
			String line = scan.nextLine();
			String[] ListForLength = line.split(" ");
			for(int i = 0;i<ListForLength.length;i++) {
				if(check == 0){
					check += 1;
					continue;
				}else if(numberCommand == 1) {
					list[i] = ListForLength[0]; 
				}else if(numberCommand == 2) {
					list[i] = ListForLength[1];
				}else if(numberCommand == 3) {
					list[i] = ListForLength[2];
				}
			}
			scan.close();
		}
		return list;
		
	}
	
	//*String[] to Int[]
	public int[] StringtoInt(int numberCommand) throws IOException {
		String[] List = getList(numberCommand);
		int[] LISTisINT = new int[count()];
		for(int i = 0;i<List.length;i++) {
			LISTisINT[i] = Integer.parseInt(List[i]);
		}
		return LISTisINT;
	}
	
	//FOOD
	public String[] getNameFood() {
		return nameFood;
	}
	public void setNameFood() throws IOException {
		this.nameFood = getList(1);
		
	}
	
	//Price
	public int[] getPrice() {
		return price;
	}
	public void setPrice()throws IOException {
		this.price = StringtoInt(2);
	}
	
	//Quantity
	
	public int[] getQuantity() {
		return quantity;
	}
	public void setQuantity() throws IOException{
		this.quantity = StringtoInt(3);
	}
	
	
	

}

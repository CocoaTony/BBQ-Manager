package fortest;

public class Booking {
	private String name;
	private String time;
	private String table;
	private String phone;
	
	
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
	public void setTime(String time) {
		this.time = time;
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
	
	
	
}

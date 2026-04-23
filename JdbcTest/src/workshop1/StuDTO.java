package workshop1;

public class StuDTO {
	
	String number;
	String name;
	String address;
	String date;
	String absence;
	
	public StuDTO() {
		// TODO Auto-generated constructor stub
	}

	public StuDTO(String number, String name, String address, String date, String absence) {
		this.number = number;
		this.name = name;
		this.address = address;
		this.date = date;
		this.absence = absence;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAbsence() {
		return absence;
	}

	public void setAbsence(String absence) {
		this.absence = absence;
	}

	@Override
	public String toString() {
		return "StuDTO [number=" + number + ", name=" + name + ", address=" + address + ", date=" + date + ", absence="
				+ absence + "]";
	}
	
	
}

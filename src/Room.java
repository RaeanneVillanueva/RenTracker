
public class Room {
	
	private String roomNum, tenantName, contracStrt, rentAmt, rentDue, parking;
	
	public Room(String roomNum, String tenantName, String contracStrt, String rentAmt, String rentDue, String parking) {
		this.roomNum = roomNum;
		this.tenantName = tenantName;
		this.contracStrt = contracStrt;
		this.rentAmt = rentAmt;
		this.rentDue = rentDue;
		this.parking = parking;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getContracStrt() {
		return contracStrt;
	}

	public void setContracStrt(String contracStrt) {
		this.contracStrt = contracStrt;
	}

	public String getRentAmt() {
		return rentAmt;
	}

	public void setRentAmt(String rentAmt) {
		this.rentAmt = rentAmt;
	}

	public String getRentDue() {
		return rentDue;
	}

	public void setRentDue(String rentDue) {
		this.rentDue = rentDue;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}
	

}

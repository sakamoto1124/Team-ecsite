package jp.co.internous.leo.model.form;

import java.io.Serializable;

public class DestinationForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private int userId;
	private String familyName;
	private String firstName;
	private String address;
	private String telNumber;

	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserId() {
		return userId;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getFamilyName() {
		return familyName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getTelNumber() {
		return telNumber;
	}
}

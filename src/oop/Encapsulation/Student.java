package oop.Encapsulation;

public class Student {
	private int studID;
	private String countryOrigin;
	private char sex;
	private boolean citizenUS;
	
	public boolean getCitizenUS(boolean citizenUS) {
	this.citizenUS=citizenUS;
	return citizenUS;
	}
	
	public int getStudID() {
		return studID;
	}
	public void setStudID(int studID) {
		this.studID = studID;
	}
	public String getCountryOrigin() {
		return countryOrigin;
	}
	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	

}

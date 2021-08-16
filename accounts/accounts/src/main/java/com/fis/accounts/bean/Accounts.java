package com.fis.accounts.bean;

public class Accounts {

	private long number;
	private String type;
	private double balence;

	public Accounts() {
	}

	public Accounts(long number, String type, double balence) {
		super();
		this.number = number;
		this.type = type;
		this.balence = balence;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalence() {
		return balence;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}

	@Override
	public String toString() {
		return "Accounts [number=" + number + ", type=" + type + ", balence=" + balence + "]";
	}

}

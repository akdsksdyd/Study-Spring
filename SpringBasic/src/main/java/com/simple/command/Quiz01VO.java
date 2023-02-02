package com.simple.command;

public class Quiz01VO {

	String year;
	String month;
	String day;
	
	public Quiz01VO() {
	}

	public Quiz01VO(String year, String month, String day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		
		if(month.length() < 2) {
			month = "0" + month;
		}
		
		return year + month + day;
	}
	
}

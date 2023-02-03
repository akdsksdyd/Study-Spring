package com.simple.command;

public class ScoreVO {//DTO
	
	private String name;
	private String kor;
	private String eng;
	private int num;
	
	public ScoreVO() {
	}

	public ScoreVO(String name, String kor, String eng, int num) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "ScoreVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", num=" + num + "]";
	}

}

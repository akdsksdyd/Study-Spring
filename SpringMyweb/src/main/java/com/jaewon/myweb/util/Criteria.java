package com.jaewon.myweb.util;

import lombok.Data;

//sql���� ��������ȣ, ������ ���� ���� �� �� Ŭ����
@Data
public class Criteria {

	private int page; //������ ��ȣ
	private int amount; //������ ����
	
	private String searchType; //�˻�Ÿ�� 
	private String searchName; //�˻���
	
	public Criteria() {
		this.page = 1;
		this.amount = 10;
	}

	public Criteria(int page, int amount) {
		super();
		this.page = page;
		this.amount = amount;
	}
	
	//limit�Լ��� ������ ���� �κп� �� getter
	public int getPageStart() {
		
		return (page - 1) * amount;
	}
	
}










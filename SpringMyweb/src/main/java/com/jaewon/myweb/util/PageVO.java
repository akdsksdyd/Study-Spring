package com.jaewon.myweb.util;

import lombok.Data;

//ȭ�鿡 �׷����� ���������̼��� ���� ����ϴ� Ŭ����
@Data
public class PageVO {

	private int end; //���������̼� �� ��ȣ
	private int start; //���������̼� ���� ��ȣ
	private boolean next; //������ư Ȱ��ȭ ����
	private boolean prev; //������ư Ȱ��ȭ ����
	
	private int realEnd; //���������̼� ���� �� ��ȣ
	
	private int page; //����ڰ� ��ȸ�ϴ� ��������ȣ
	private int amount; //ȭ�� 1�������� ��Ÿ���� �����Ͱ���
	private int total; //��ü �Խñ� ��
	
	private Criteria cri; //������ ���� Ŭ����
	
	private int pageCnt =5; //���������̼� ����
	
	//������ - pageVO�� ����� �� �� cri, total�� �޴´�
	public PageVO(Criteria cri, int total) {
		//��꿡 �ʿ��� ��(��������ȣ, �����Ͱ���, ��ü�Խñ� ��, cri)�� �ʱ�ȭ
		this.page = cri.getPage();
		this.amount = cri.getAmount();
		this.total = total;
		this.cri = cri;
		
		//1. �� ��������ȣ ���
		//page�� 1~10 - �������� 10
		//page�� 11~20 - �������� 20
		//(int)Math.ceil(�ø�)(��������ȣ / 10.0) * ���������̼� ��
		this.end = (int)Math.ceil(this.page / (double)pageCnt) * pageCnt;
		
		//2. ���� ��������ȣ ���
		//end - ���������̼� �� + 1
		this.start = (this.end - pageCnt) + 1;
		
		//3. ���� �� ��ȣ ���
		//�����Ͱ� 60����� ���� �� ��, end = 6
		//�����Ͱ� 112����� ���� �� ��, 11�������� ��ȸ �� end = 12
		//�����Ͱ� 356����� ���� �� ��, 32�� ������ ��ȸ �� end = 36
		//(int)Math.ceil(��ü�Խñ� �� / �����Ͱ���)
		this.realEnd = (int)Math.ceil(this.total / (double)this.amount); //���� / ������ ������ ������ �ø��� ���������� x
		
		//4. ������ ������ ��ȣ�� �ٽ� ���
		//�����Ͱ� 112�� ��� ���� �� ��, 5�� ������ ��ȸ �� end = 10, realEnd = 12 --> end ��
		//�����Ͱ� 112�� ��� ���� �� ��, 11�� ������ ��ȸ �� end = 20, realEnd = 12 --> realEnd ��
		//���� end(����ȣ) > realEnd(��������ȣ) �� realEnd, end < realEnd �� end ���� ���󰡴� ������ �����.
		this.end = this.end > this.realEnd ? this.realEnd : this.end;
		
		//5. ������ư
		//start�� 1, 11, 21, 31, ... �� �����Ǵµ� 1���� ũ�� true
		this.prev = this.start > 1;
		
		//6. ������ư
		//���� - realEnd�� end���� ũ�� true
		this.next = this.realEnd > this.end;
		
	}
	
}









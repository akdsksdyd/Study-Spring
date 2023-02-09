package com.jaewon.myweb.trip.service;

import java.util.ArrayList;

import com.jaewon.myweb.command.TripVO;
import com.jaewon.myweb.util.Criteria;

public interface TripService {

	public int noticeRegist(TripVO vo);//���
	
	public ArrayList<TripVO> getList(Criteria cri);//��ȸ
	
	public int getTotal(Criteria cri); //��ü �Խñ� ��

	public TripVO getContent(int tno);//����ȸ
	
	public int noticeModify(TripVO vo);//����
	
	public int deleteForm(int tno);
	
	public void upHit(int tno);
	
	public ArrayList<TripVO> getPrevNext(int tno);
	
}

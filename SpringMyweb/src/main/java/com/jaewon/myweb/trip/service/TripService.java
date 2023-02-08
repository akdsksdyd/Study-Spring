package com.jaewon.myweb.trip.service;

import java.util.ArrayList;

import com.jaewon.myweb.command.TripVO;

public interface TripService {

	public int noticeRegist(TripVO vo);//���
	
	public ArrayList<TripVO> getList();//��ȸ
	
	public TripVO getContent(int tno);//����ȸ
	
	public int noticeModify(TripVO vo);//����
	
	public int deleteForm(int tno);
	
	public void upHit(int tno);
	
	public ArrayList<TripVO> getPrevNext(int tno);
	
}

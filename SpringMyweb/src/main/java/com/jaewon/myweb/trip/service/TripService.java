package com.jaewon.myweb.trip.service;

import java.util.ArrayList;

import com.jaewon.myweb.command.TripVO;

public interface TripService {

	public int noticeRegist(TripVO vo);//등록
	
	public ArrayList<TripVO> getList();//조회
	
	public TripVO getContent(int tno);//상세조회
	
	public int noticeModify(TripVO vo);//수정
	
	public int deleteForm(int tno);
	
	public void upHit(int tno);
	
	public ArrayList<TripVO> getPrevNext(int tno);
	
}

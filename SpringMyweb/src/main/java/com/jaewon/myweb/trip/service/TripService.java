package com.jaewon.myweb.trip.service;

import java.util.ArrayList;

import com.jaewon.myweb.command.TripVO;
import com.jaewon.myweb.util.Criteria;

public interface TripService {

	public int noticeRegist(TripVO vo);//등록
	
	public ArrayList<TripVO> getList(Criteria cri);//조회
	
	public int getTotal(Criteria cri); //전체 게시글 수

	public TripVO getContent(int tno);//상세조회
	
	public int noticeModify(TripVO vo);//수정
	
	public int deleteForm(int tno);
	
	public void upHit(int tno);
	
	public ArrayList<TripVO> getPrevNext(int tno);
	
}

package com.jaewon.myweb.trip.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.jaewon.myweb.command.TripVO;
import com.jaewon.myweb.util.Criteria;

@Mapper
public interface TripMapper {
	
	public int noticeRegist(TripVO vo);
	
//	public ArrayList<TripVO> getList();//조회
	public ArrayList<TripVO> getList(Criteria cri);//페이지
	
	public int getTotal(Criteria cri); //전체 게시글 수

	public TripVO getContent(int tno);
	
	public int noticeModify(TripVO vo);
	
	public int deleteForm(int tno);
	
	public void upHit(int tno);
	
	public ArrayList<TripVO> getPrevNext(int tno);
	
}











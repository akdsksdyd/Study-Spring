package com.jaewon.myweb.trip.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.jaewon.myweb.command.TripVO;

@Mapper
public interface TripMapper {
	
	public int noticeRegist(TripVO vo);
	
	public ArrayList<TripVO> getList();
	
	public TripVO getContent(int tno);
	
	public int noticeModify(TripVO vo);
	
	public int deleteForm(int tno);
	
	public void upHit(int tno);
	
	public ArrayList<TripVO> getPrevNext(int tno);

}











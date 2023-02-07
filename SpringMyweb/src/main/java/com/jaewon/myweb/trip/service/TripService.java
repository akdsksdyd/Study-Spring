package com.jaewon.myweb.trip.service;

import java.util.ArrayList;

import com.jaewon.myweb.command.TripVO;

public interface TripService {

	public int noticeRegist(TripVO vo);
	
	public ArrayList<TripVO> getList();
	
}

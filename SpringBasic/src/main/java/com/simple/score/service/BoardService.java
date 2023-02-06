package com.simple.score.service;

import java.util.ArrayList;

import com.simple.command.BoardVO;

public interface BoardService {
	
	public void regist(BoardVO vo); 
	
	public ArrayList<BoardVO> getList();
	
	public void delete(int num);
	
}

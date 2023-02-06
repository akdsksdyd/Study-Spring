package com.simple.score.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.board.mapper.BoardMapper;
import com.simple.command.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper BoardMapper;
	
	@Override
	public void regist(BoardVO vo) {
		BoardMapper.regist(vo);
	}
	
	@Override
	public ArrayList<BoardVO> getList() {
		
		return BoardMapper.getList();
	}
	
	@Override
	public void delete(int num) {
		BoardMapper.delete(num);
	}
	
}

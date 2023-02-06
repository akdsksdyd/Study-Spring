package com.simple.score.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.score.dao.ScoreDAO;
import com.simple.score.mapper.ScoreMapper;

//@Controller //�� ���� ����� ������ ������ �ϱ� ���� ����.
//@Repository
//@Component
@Service("xxx") //���� �̸� ���
public class ScoreServiceImpl implements ScoreService{
	
	@Autowired
	@Qualifier("yyy")
	private ScoreDAO scoreDAO;
	//���̹�Ƽ���� ����
	@Autowired
	private ScoreMapper ScoreMapper;
	
	public void regist(ScoreVO vo) {
		ScoreMapper.regist(vo);
	}
	
	@Override
	public ArrayList<ScoreVO> getList() {
		
		//ArrayList<ScoreVO> list = scoreDAO.getList();
		
		return ScoreMapper.getList();
	}
	
	@Override
	public void delete(int num) {
		
		ScoreMapper.delete(num);
		
	}
	
}











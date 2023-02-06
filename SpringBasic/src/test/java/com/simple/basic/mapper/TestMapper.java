package com.simple.basic.mapper;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.simple.command.ScoreVO;

@Mapper //���̹�Ƽ�� ���۸� ��Ī -(���Ǹ������� ��������)
public interface TestMapper {
	
	public String getTime(); //1
	
	public ArrayList<ScoreVO> getScore();
	
	public ScoreVO getOne(int a);
	
	//1 or 0 -> int, true or false -> boolean, �ȹ޾Ƶ� �Ǹ� -> void
	public int insertOne(String name);
	
	//���߰�
	public int insertTwo(ScoreVO vo);
	
	//���߰�
	public int insertThree(Map<String, String> map);
	
	public Map<String, Object> selectMap(int num);
	
	//���� ���� ������ ��ȸ
	public ArrayList<Map<String, Object>> selectTwo();
	
	public boolean updateOne(ScoreVO vo); //update
	
	public void insertFour(@Param("name") String name,@Param("kor") int kor);
	
}






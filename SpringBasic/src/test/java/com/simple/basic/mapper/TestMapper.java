package com.simple.basic.mapper;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.simple.command.ScoreVO;

@Mapper //마이바티스 매퍼를 지칭 -(스피링에서는 생략가능)
public interface TestMapper {
	
	public String getTime(); //1
	
	public ArrayList<ScoreVO> getScore();
	
	public ScoreVO getOne(int a);
	
	//1 or 0 -> int, true or false -> boolean, 안받아도 되면 -> void
	public int insertOne(String name);
	
	//다중값
	public int insertTwo(ScoreVO vo);
	
	//다중값
	public int insertThree(Map<String, String> map);
	
	public Map<String, Object> selectMap(int num);
	
	//맵을 통한 다중행 조회
	public ArrayList<Map<String, Object>> selectTwo();
	
	public boolean updateOne(ScoreVO vo); //update
	
	public void insertFour(@Param("name") String name,@Param("kor") int kor);
	
}






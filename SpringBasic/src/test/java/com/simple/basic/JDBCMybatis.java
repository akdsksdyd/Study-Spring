package com.simple.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;
import com.simple.command.ScoreVO;

@RunWith(SpringJUnit4ClassRunner.class) //junit으로 테스트환경을 구성
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml")//동작시킬 스프링 설정파일
public class JDBCMybatis {

	@Autowired
	SqlSessionFactoryBean sqlSessionFactory;
	
//	@Test
//	public void testCode01() {
//	
//		//마이바티스 핵심 객체
//		System.out.println(sqlSessionFactory);
//		
//	}

	@Autowired
	TestMapper testMapper;
	
//	@Test
//	public void testCode02() {
//		
//		String time = testMapper.getTime();
//		System.out.println(time);
//		
//	}
	
	//select태그의 resultType
//	@Test
//	public void testCode03() {
//		ArrayList<ScoreVO> list = testMapper.getScore();
//		System.out.println(list.toString());
//	}
	
	//매개변수 - 단일값
//	@Test
//	public void testCode04() {
//		ScoreVO vo = testMapper.getOne(8);
//		System.out.println(vo.toString());
//	}
	
	//insert - 단일값
//	@Test
//	public void testCode05() {
//		int result = testMapper.insertOne("홍길동");
//		
//		if(result == 1) {
//			System.out.println("성공");
//		}else {
//			System.out.println("실패");
//		}
//	}
	
	//insert - 다중값(vo) - setter가 파라미터가 됨.
//	@Test
//	public void testCode06() {
//		
//		ScoreVO vo = new ScoreVO("테스트", "100", "50", 0);
//		int result = testMapper.insertTwo(vo);
//		
//		if(result == 1) {
//			System.out.println("성공");
//		}else {
//			System.out.println("실패");
//		}
//		
//	}
	
	//insert - 다중값(map)
//	@Test
//	public void testCode07() {
//		
//		Map<String, String> map = new HashMap<>();
//		map.put("name", "홍길자");
//		map.put("kor", "30");
//		map.put("eng", "40");
//		
//		int result = testMapper.insertThree(map);
//		
//		if(result == 1) {
//			System.out.println("성공");
//		}else {
//			System.out.println("실패");
//		}
//		
//	}
	
	//select - map타입의 반환 : 맵 타입을 사용 하는 것은 부득이 한 경우만 사용.
//	@Test
//	public void testCode08() {
//		Map<String, Object> map = testMapper.selectMap(8);
//		System.out.println(map.toString());
//	}
	
//	@Test
//	public void testCode09() {
//		ArrayList<Map<String, Object>> list = testMapper.selectTwo();
//		System.out.println(list.toString());
//	}
	
	//update 구문
//	@Test
//	public void testCode10() {
//		ScoreVO vo = new ScoreVO("변경2", "99", "99", 20);
//		boolean result = testMapper.updateOne(vo);
//		
//		if(result == true) {
//			System.out.println("업데이트 성공");
//		}else {
//			System.out.println("업데이트 실패");
//		}
//		
//	}
	
	//insert구문 @Param - 매개변수
	@Test
	public void testCode11() {
		
		testMapper.insertFour("파람테스트", 100);
		
	}
	
}
















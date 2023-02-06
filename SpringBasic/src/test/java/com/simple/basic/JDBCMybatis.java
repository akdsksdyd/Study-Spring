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

@RunWith(SpringJUnit4ClassRunner.class) //junit���� �׽�Ʈȯ���� ����
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml")//���۽�ų ������ ��������
public class JDBCMybatis {

	@Autowired
	SqlSessionFactoryBean sqlSessionFactory;
	
//	@Test
//	public void testCode01() {
//	
//		//���̹�Ƽ�� �ٽ� ��ü
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
	
	//select�±��� resultType
//	@Test
//	public void testCode03() {
//		ArrayList<ScoreVO> list = testMapper.getScore();
//		System.out.println(list.toString());
//	}
	
	//�Ű����� - ���ϰ�
//	@Test
//	public void testCode04() {
//		ScoreVO vo = testMapper.getOne(8);
//		System.out.println(vo.toString());
//	}
	
	//insert - ���ϰ�
//	@Test
//	public void testCode05() {
//		int result = testMapper.insertOne("ȫ�浿");
//		
//		if(result == 1) {
//			System.out.println("����");
//		}else {
//			System.out.println("����");
//		}
//	}
	
	//insert - ���߰�(vo) - setter�� �Ķ���Ͱ� ��.
//	@Test
//	public void testCode06() {
//		
//		ScoreVO vo = new ScoreVO("�׽�Ʈ", "100", "50", 0);
//		int result = testMapper.insertTwo(vo);
//		
//		if(result == 1) {
//			System.out.println("����");
//		}else {
//			System.out.println("����");
//		}
//		
//	}
	
	//insert - ���߰�(map)
//	@Test
//	public void testCode07() {
//		
//		Map<String, String> map = new HashMap<>();
//		map.put("name", "ȫ����");
//		map.put("kor", "30");
//		map.put("eng", "40");
//		
//		int result = testMapper.insertThree(map);
//		
//		if(result == 1) {
//			System.out.println("����");
//		}else {
//			System.out.println("����");
//		}
//		
//	}
	
	//select - mapŸ���� ��ȯ : �� Ÿ���� ��� �ϴ� ���� �ε��� �� ��츸 ���.
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
	
	//update ����
//	@Test
//	public void testCode10() {
//		ScoreVO vo = new ScoreVO("����2", "99", "99", 20);
//		boolean result = testMapper.updateOne(vo);
//		
//		if(result == true) {
//			System.out.println("������Ʈ ����");
//		}else {
//			System.out.println("������Ʈ ����");
//		}
//		
//	}
	
	//insert���� @Param - �Ű�����
	@Test
	public void testCode11() {
		
		testMapper.insertFour("�Ķ��׽�Ʈ", 100);
		
	}
	
}
















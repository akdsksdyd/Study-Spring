package com.simple.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class) //junit���� �׽�Ʈȯ���� ����
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml")//���۽�ų ������ ��������
public class JDBCMybatis {

	@Autowired
	SqlSessionFactoryBean sqlSessionFactory;
	
	@Autowired
	TestMapper testMapper;
	
	@Test
	public void testCode01() {
	
		//���̹�Ƽ�� �ٽ� ��ü
		System.out.println(sqlSessionFactory);
		
	}
	
	@Test
	public void testCode02() {
		
		String time = testMapper.getTime();
		System.out.println(time);
		
	}
	
}

package com.simple.basic;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //junit���� �׽�Ʈȯ���� ����
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml")//���۽�ų ������ ��������
public class JDBCTest {
	
//	@BeforeClass //�ش� Ŭ�������� �� �� �� ���� -static
//	public static void loadTest() {
//		System.out.println("beforeClass");
//	}
//	
//	@Before //�� �׽�Ʈ �ڵ带 �����ϱ� ���� �켱����
//	public void testCode00() {
//		System.out.println("before");
//	}
	
	@Autowired
	DataSource dataSource;
	
	@Test //test�ڵ�� ����.
	public void testCode01() {
		
		try {
			
			Connection conn = dataSource.getConnection();
			System.out.println(conn);
			
		} catch (Exception e) {
			
		}
		
	}

	

}



















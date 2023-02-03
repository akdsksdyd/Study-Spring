package com.simple.score.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

@Repository("yyy")
public class ScoreDAOImpl implements ScoreDAO{
	/*
	//�����ͺ��̽� �����ϱ� ��
	ArrayList<ScoreVO> list = new ArrayList<>();
	
	@Override
	public void regist(ScoreVO vo) {
		
		//DB����
		//Class.forName("����̹�Ŭ����"); �̷��� ���� �� ���� ������
		//������������ ���� �̸� ������ �� ���� �� �ִ�.
		
		//System.out.println("DAO����: " + vo.toString());
		list.add(vo); //insert���� ���.
		System.out.println(list.toString());
		
	}
	
	@Override
	public ArrayList<ScoreVO> getList() {
		
		//������ ��ȸ
		
		return list;
	}
	
	@Override
	public void delete(int num) {
		
		//�����۾�
		list.remove(num);
 		
	}
	*/
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public void regist(ScoreVO vo) {
		
		String sql = "insert into score(name, kor, eng) values(?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = dataSource.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getKor());
			pstmt.setString(3, vo.getEng());
			
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				
			} catch (Exception e) {
			}
			
		}
		
	}
	
	@Override
	public ArrayList<ScoreVO> getList() {
		
		ArrayList<ScoreVO> list = new ArrayList<>();
		
		String sql = "select * from score order by num asc";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			//ORM
			while(rs.next()) {
				
				ScoreVO vo = new ScoreVO();
				
				vo.setNum(rs.getInt("num")); //column��
				vo.setName(rs.getString("name"));
				vo.setKor(rs.getString("kor"));
				vo.setEng(rs.getString("eng"));
				
				list.add(vo);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
		return list;
	}
	
	@Override
	public void delete(int num) {
		
		//������� - num�� key�� �ƴ϶� index�� �Ѿ�´�.
		//(ȭ�鿡�� key�� �ѱ⵵�� ����)
		
		String sql = "delete from score where num = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}
	
}















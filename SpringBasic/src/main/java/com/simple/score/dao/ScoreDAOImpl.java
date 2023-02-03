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
	//데이터베이스 연동하기 전
	ArrayList<ScoreVO> list = new ArrayList<>();
	
	@Override
	public void regist(ScoreVO vo) {
		
		//DB연동
		//Class.forName("드라이버클래스"); 이렇게 직접 할 수도 있지만
		//스프링에서는 따로 미리 연결을 해 놓을 수 있다.
		
		//System.out.println("DAO영역: " + vo.toString());
		list.add(vo); //insert구문 대신.
		System.out.println(list.toString());
		
	}
	
	@Override
	public ArrayList<ScoreVO> getList() {
		
		//데이터 조회
		
		return list;
	}
	
	@Override
	public void delete(int num) {
		
		//삭제작업
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
				
				vo.setNum(rs.getInt("num")); //column명
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
		
		//삭제기능 - num은 key가 아니라 index가 넘어온다.
		//(화면에서 key를 넘기도록 변경)
		
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















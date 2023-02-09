package com.jaewon.myweb;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jaewon.myweb.command.TripVO;
import com.jaewon.myweb.trip.service.TripMapper;
import com.jaewon.myweb.util.Criteria;

@RunWith(SpringJUnit4ClassRunner.class) //junit으로 테스트환경을 구성
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml")//동작시킬 스프링 설정파일
public class PageTest {

	@Autowired
	TripMapper tripMapper;
	
//	@Test
//	public void TestCode01() {
//		
//		for(int i = 0; i < 300; i++) {
//			TripVO vo = new TripVO(0, "2023-02-08", "admin"+i, "test"+i, "example"+i, 0, null);
//			tripMapper.noticeRegist(vo);
//		}
//		
//	}
	
	@Test
	public void TestCode02() {
		
//		Criteria cri = new Criteria(); // 1, 10
		Criteria cri = new Criteria(2, 10);
		
		ArrayList<TripVO> list = tripMapper.getList(cri);
		
		list.stream().forEach( x -> System.out.println(x) );
		
	}
	
}


















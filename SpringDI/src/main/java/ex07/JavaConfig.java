package ex07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex02.Chef;
import ex02.DatabaseDev;
import ex02.Hotel;
import ex02.MemberDAO;
import ex06.DAO;

//xml을 대신해서 설정파일로 사용 할 때
@Configuration
public class JavaConfig {
	
	//@Bean이 붙은 메서드를 스프링 컨테이너가 호출시킴(빈으로 생성)
	@Bean
	public Chef chef() {
		return new Chef();
	}
	
	@Bean
	public Hotel hotel() {
		return new Hotel(chef());
	}
	
	@Bean
	public DatabaseDev dev() {
		
		//DatabaseDev파일에 3개의 변수가 있기 때문.
		DatabaseDev dev = new DatabaseDev();
		dev.setUrl("주소");
		dev.setUid("아이디");
		dev.setUpw("비번");
		
		return dev;
	}
	
	@Bean
	public MemberDAO dao() {
		
		MemberDAO dao = new MemberDAO();
		dao.setDatabaseDev(dev());
		
		return dao;
	}
	
}

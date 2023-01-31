package ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Controller {
	
	@Autowired
	@Qualifier(value = "service")
	private ServiceImpl service;
	
	public Controller() {
	}

	public Controller(ServiceImpl service) {
		this.service = service;
	}

	public ServiceImpl getService() {
		return service;
	}

	public void setService(ServiceImpl service) {
		this.service = service;
	}

	public void hello() {
		
		//MVC2 방식의 클래스 모형입니다.
		//1. Controller에서 new키워드를 사용하지 말고 "자동주입"을 이용해서 Service의 hello를 호출시켜주세요
		//2. Service에서는   new키워드를 사용하지 말고 "자동주입"을 이용해서 DAO의 hello를 호출시켜주세요
		//3. DAO에 있는 리턴값을 Controller로 반환받고 출력해주세요
		//4. main에서는 컨트롤러 객체를 확인
		
		System.out.println(service.hello());
		
	}

}

package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.MemberDAO;

public class MainClass {
	
	public static void main(String[] args) {
		
		//java설정으로 만들어진 bean파일은
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//동작하는 bean의 갯수 (내부적으로 동작하는 bean이 6개가 기본적으로 있다)
		//System.out.println(ctx.getBeanDefinitionCount());
		
		MemberDAO dao = ctx.getBean("dao", MemberDAO.class);
		System.out.println(dao.getDatabaseDev().getUrl());
		System.out.println(dao.getDatabaseDev().getUid());
		System.out.println(dao.getDatabaseDev().getUpw());
		
	}

}

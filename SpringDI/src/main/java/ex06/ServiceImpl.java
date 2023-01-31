package ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ServiceImpl {
	
	@Autowired
	@Qualifier(value = "dao")
	private DAO dao;
	
	public ServiceImpl() {
	}

	public ServiceImpl(DAO dao) {
		this.dao = dao;
	}

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public String hello() {
		
		return dao.hello();
	}
	
}

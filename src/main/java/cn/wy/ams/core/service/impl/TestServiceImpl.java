package cn.wy.ams.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wy.ams.core.core.dao.TestDao;
import cn.wy.ams.core.entity.Test;
import cn.wy.ams.core.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
    private TestDao testDao;
	
	@Override
	public String test() {
		return "test";
	}

	@Override
	public Long savePerson() {
		Test person = new Test();
        person.setUsername("XRog");
        person.setPhone("18381005946");
        person.setAddress("chenDu");
        person.setRemark("this is XRog");
        return (Long) testDao.save(person);
	}

}

package cn.wy.ams.core.core.dao.impl;

import org.springframework.stereotype.Repository;

import cn.wy.ams.core.core.dao.TestDao;
import cn.wy.ams.core.entity.Test;

@Repository("testDao")
public class TestDaoImpl extends BaseDaoImpl<Test> implements TestDao {
	
}

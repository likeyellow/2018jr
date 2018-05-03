package org.zerock.web;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mappers.TimeMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {
	//@Inject
	@Autowired
	SqlSessionFactory factory;
	
	@Autowired
	TimeMapper timeMapper;
	
	@Test
	public void testExists() {
		log.info(factory);
	}
	
	@Test
	public void testTime() {
		log.info(timeMapper.getTime());
	}
}

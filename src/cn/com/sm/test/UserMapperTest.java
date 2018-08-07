package cn.com.sm.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.sm.mapper.UserQueryMapper;
import cn.com.sm.po.User;

public class UserMapperTest {

	private ApplicationContext applicationContext ;
	
	@Before
	public void setup() throws Exception{
		applicationContext = new 
	ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	@Test
	public void testFindUserById() throws Exception{
		UserQueryMapper userQueryMapper=(UserQueryMapper) applicationContext.getBean("userQueryMapper");
		User user =userQueryMapper.findUserById(1);
		System.out.println(user.getId()+":"+user.getUsername());
	}
}

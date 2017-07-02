package com.tdzmxjz;

import com.tdzmxjz.entity.User;
import com.tdzmxjz.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMybatisApplication.class)
@EnableAutoConfiguration
public class SpringBootMybatisApplicationTests {
	@Autowired
	private UserService userServce;
	@Test
	public void contextLoads() {
		User user=new User();
		user.setId(String.valueOf(UUID.randomUUID()));
		user.setUserName("mxjz");
		user.setUserPassWord("123456");
		userServce.addUser(user);
	}

}

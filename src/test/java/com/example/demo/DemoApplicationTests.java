package com.example.demo;

import com.example.demo.day03.UserService;
import com.example.demo.day04.AdminService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	UserService userService;

	@Autowired
	AdminService adminUserService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void serviceLoad_Test() {
		Assert.assertNotNull(userService);
	}

	@Test
	public void adminServiceTest() {
		Assert.assertNotNull(adminUserService);
		Assert.assertNotNull(adminUserService.getRepository());
	}
}

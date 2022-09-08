package com.mp.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mp.dao.UserMapper;
import com.mp.entity.User;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyFillTest {

	private UserMapper userMapper;

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Test
	public void insert() {
		User user = new User();
		user.setName("刘西");
		user.setAge(30);
		user.setEmail("lx@baomidou.com");
		user.setManagerId(1088248166370832385L);
		int rows = this.userMapper.insert(user);
		System.out.println("影响记录数：" + rows);
	}
	
	@Test
	public void updateById() {
		User user = new User();
		user.setId(1088248166370832385L);
		user.setAge(27);
		int rows = this.userMapper.updateById(user);
		System.out.println("影响记录数：" + rows);
	}
}

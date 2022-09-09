package com.mp.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyOptTest {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Test
    public void update() {
        int version = 2;
        User user = new User();
        user.setAge(26);
        user.setEmail("ly3@baomidou.com");
        user.setVersion(version);
        QueryWrapper<User> queryWrapper = Wrappers.query();
        queryWrapper.eq("name", "李玉");
        int rows = this.userMapper.update(user, queryWrapper);
        System.out.println("影响记录数：" + rows);

        int version2 = 3;
        User user2 = new User();
        user2.setAge(27);
        user2.setEmail("ly4@baomidou.com");
        user2.setVersion(version2);
        QueryWrapper<User> queryWrapper2 = Wrappers.query();
        queryWrapper2.eq("name", "李玉");
        int rows2 = this.userMapper.update(user2, queryWrapper2);
        System.out.println("影响记录数：" + rows2);
    }

    @Test
    public void updateById() {
        int version = 1;
        User user = new User();
        user.setId(1568151531925721090L);
        user.setEmail("ly2@baomidou.com");
        user.setVersion(version);
        int rows = this.userMapper.updateById(user);
        System.out.println("影响记录数：" + rows);
    }
}

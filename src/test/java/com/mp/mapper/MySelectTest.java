package com.mp.mapper;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mp.config.MyBatisPlusConfiguration;
import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MySelectTest {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Test
    public void select() {
        MyBatisPlusConfiguration.myTableName.set("user_2019");
        List<User> userList = this.userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
    
    @Test
    public void mySelect() {
        List<User> userList = this.userMapper.mySelectList(Wrappers.<User>lambdaQuery().gt(User::getAge, 25).eq(User::getDeleted, 0));
        userList.forEach(System.out::println);
    }
}

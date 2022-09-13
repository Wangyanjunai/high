package com.mp.mapper;

import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyUpdateTest {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Test
    public void updateById() {
        User user = new User();
        user.setAge(28);
        user.setId(1088248166370832385L);
        int rows = this.userMapper.updateById(user);
        System.out.println("更新影响记录数：" + rows);
    }
}

package com.mp.mapper;

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
public class MyDeleteTest {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Test
    public void deleteById() {
        int rows = this.userMapper.deleteById(1567397718352678914L);
        System.out.println("删除记录数：" + rows);
    }

    @Test
    public void select() {
        List<User> userList = this.userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void updateById() {
        User user = new User();
        user.setAge(26);
        user.setId(1088248166370832385L);
        int rows = this.userMapper.updateById(user);
        System.out.println("更新影响记录数：" + rows);
    }
}

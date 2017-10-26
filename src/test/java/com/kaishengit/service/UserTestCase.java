package com.kaishengit.service;

import com.kaishengit.entity.User;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class UserTestCase {
    SqlSession sqlSession;
    UserMapper userMapper;

    @Before
    public void init(){
        sqlSession = MyBatisSqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @After
    public void after(){
        sqlSession.close();
    }

    @Test
    public void save(){
        User user = new User("jack","7654321",1);
        userMapper.save(user);
        System.out.println(user.getId());
        sqlSession.commit();
    }

    @Test
    public void update(){
        User user = userMapper.findById(1);
        user.setName("wanghui");
        userMapper.update(user);
        sqlSession.commit();
    }
    @Test
    public void delete(){
        userMapper.delete(1);
        sqlSession.commit();
    }
    @Test
    public void findAll(){
        List<User> userList = userMapper.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
    @Test
    public void findUserWithDept(){
        User user = userMapper.findUserWithDept(2);
        System.out.println(user);
    }

}

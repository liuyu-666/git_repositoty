package com.kaishengit.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/*
*
* @author liuyu
* @date 17/10/22
* */
public class MyBatisSqlSessionFactory {
    private static SqlSessionFactory sqlSessionFactory;
    public static SqlSessionFactory getSqlSessionFactory() {
        if (sqlSessionFactory == null) {
                InputStream inputStream;
                try {
                inputStream = Resources.getResourceAsStream("mybatis-config.xml");

                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSession(){

        return getSqlSessionFactory().openSession();
    }

}

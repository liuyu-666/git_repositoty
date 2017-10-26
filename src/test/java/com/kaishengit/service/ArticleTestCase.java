package com.kaishengit.service;

import com.kaishengit.entity.Article;
import com.kaishengit.mapper.ArticleMapper;
import com.kaishengit.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * @author liuyu
 * @date 2017/10/26
 */
public class ArticleTestCase {
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();

        ArticleMapper articleMapper = sqlSession.getMapper(ArticleMapper.class);
    @Test
    public void find(){
        Article article = articleMapper.findArticleByIdWithLabel(50);
        System.out.println(article);
    }

}

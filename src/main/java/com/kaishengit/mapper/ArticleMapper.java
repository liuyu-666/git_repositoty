package com.kaishengit.mapper;

import com.kaishengit.entity.Article;

/**
 * @author liuyu
 * @date 2017/10/26
 */
public interface ArticleMapper {
    /**
     * 通过ID查询带有LabelList的Article对象
     * @param id
     * @return Article
     */
    Article findArticleByIdWithLabel(int id);
}

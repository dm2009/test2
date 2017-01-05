package com.sivalabs.mybatisdemo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.sivalabs.mybatisdemo.domain.Blog;
import com.sivalabs.mybatisdemo.domain.Post;
import com.sivalabs.mybatisdemo.mappers.BlogMapperXml;
import com.sivalabs.mybatisdemo.service.MyBatisUtil;

public class OneToManyTest {

    // @Test
    public static void getBlogById() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            BlogMapperXml blogMapper = sqlSession.getMapper(BlogMapperXml.class);
            Blog blog = blogMapper.getBlogById(1);
            System.out.println(blog);
            List<Post> posts = blog.getPosts();
            for (Post post : posts) {
                System.out.println(post);
            }
        } finally {
            sqlSession.close();
        }
    }

    public static void main(String[] args) {
        getBlogById();
    }

}

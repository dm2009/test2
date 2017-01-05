package com.sivalabs.mybatisdemo.mappers;

import java.util.List;

import com.sivalabs.mybatisdemo.domain.Blog;

public interface BlogMapperXml {

    public Blog getBlogById(Integer userId);
    
    public List<Blog> getAllBlogs();
}

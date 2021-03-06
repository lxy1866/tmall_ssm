package com.how2java.tmall.service.impl;

import com.how2java.tmall.mapper.CategoryMapper;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.CategoryExample;
import com.how2java.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl  implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list() {
        CategoryExample example = new CategoryExample();
        example.setOrderByClause("id desc");
        return categoryMapper.selectByExample(example);
    }


    public void add(Category category){
        categoryMapper.insert(category);
    }
    public void delete(int id){
        categoryMapper.deleteByPrimaryKey(id);
    }
    public Category get(int id){
        return categoryMapper.selectByPrimaryKey(id);
    }
    public void update(Category category){
        categoryMapper.updateByPrimaryKeySelective(category);
    }
}
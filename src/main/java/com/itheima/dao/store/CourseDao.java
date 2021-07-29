package com.itheima.dao.store;

import com.itheima.domain.store.Course;

import java.util.List;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/5/6/006 15:00
 **/
public interface CourseDao {
    int save(Course course);

    int delete(Course course);

    int update(Course course);

    Course findById(String id);

    List<Course> findAll();
}

package com.itheima.dao.system;

import com.itheima.domain.system.Dept;

import java.util.List;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/5/6/006 9:05
 **/
public interface DeptDao {

    int save(Dept dept);

    int delete(Dept dept);

    int update(Dept dept);

    Dept findById(String id);

    List<Dept> findAll();

}

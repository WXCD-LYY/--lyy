package com.itheima.dao.store;

import com.itheima.domain.store.Company;

import java.util.List;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/5/5/005 10:27
 **/
public interface CompanyDao {
    void save(Company company);

    int delete(Company company);

    int update(Company company);

    Company findById(String id);

    List<Company> findAll();


}

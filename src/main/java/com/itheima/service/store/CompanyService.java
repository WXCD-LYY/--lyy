package com.itheima.service.store;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.store.Company;

import java.util.List;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/5/5/005 10:40
 **/
public interface CompanyService {

    /**
     * 添加
     * @param company
     * @return
     */
    void save(Company company);

    /**
     * 删除
     * @param company
     * @return
     */
    void delete(Company company);

    /**
     * 修改
     * @param company
     * @return
     */
    void update(Company company);

    /**
     * 查询单个
     * @param id 查询的条件
     * @return 查询结果
     */
    Company findById(String id);

    /**
     * 查询全部数据
     * @return
     */
    List<Company> findAll();

    /**
     * 分页查询数据
     * @param page 页码
     * @param size 每页总数
     * @return
     */
    PageInfo findAll(int page, int size);
}

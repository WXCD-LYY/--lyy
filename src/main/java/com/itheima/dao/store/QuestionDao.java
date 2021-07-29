package com.itheima.dao.store;

import com.itheima.domain.store.Question;

import java.util.List;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/5/6/006 16:42
 **/
public interface QuestionDao {

    int save(Question question);

    int delete(Question question);

    int update(Question question);

    Question findById(String id);

    List<Question> findAll();
}

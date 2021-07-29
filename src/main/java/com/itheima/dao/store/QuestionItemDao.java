package com.itheima.dao.store;

import com.itheima.domain.store.QuestionItem;

import java.util.List;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/5/7/007 14:16
 **/
public interface QuestionItemDao {

    int save(QuestionItem questionItem);

    int delete(QuestionItem questionItem);

    int update(QuestionItem questionItem);

    QuestionItem findById(String id);

    /**
     * 根据题目ID查询所有的选项
     * @param questionId
     * @return
     */
    List<QuestionItem> findAll(String questionId);
}

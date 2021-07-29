package com.itheima.dao.system;

import com.itheima.domain.system.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/5/8/008 15:19
 **/
public interface RoleDao {

    int save(Role role);

    int delete(Role role);

    int update(Role role);

    Role findById(String id);

    List<Role> findAll();

    void deleteRoleModule(String roleId);

    void saveRoleModule(@Param("roleId") String roleId, @Param("moduleId") String moduleId);

    List<Role> findAllRoleByUserId(String userId);
}

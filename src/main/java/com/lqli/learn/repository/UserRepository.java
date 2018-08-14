package com.lqli.learn.repository;

import com.lqli.learn.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户数据库操作接口
 *
 * @author lqli
 */
public interface UserRepository {
    /**
     * 插入
     *
     * @param user user
     * @return long 主键
     */
    int insert(User user);

    /**
     * 根据name查询
     * @param name name
     * @return User
     */
    List<User> selectByName(@Param("name") String name);
}

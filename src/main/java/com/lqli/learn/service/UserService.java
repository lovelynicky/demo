package com.lqli.learn.service;

import com.lqli.learn.domain.User;
import com.lqli.learn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 用户service 业务
 *
 * @author lqli
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 获取默认用户
     * for demo
     *
     * @return User
     */
    public User getDefaultUser() {
        return new User("hello world");
    }

    /**
     * 新增
     *
     * @param name name
     * @return long
     */
    public long add(String name) {
        User user = new User(name);
        userRepository.insert(user);
        return user.getId();
    }

    /**
     * name获取user
     *
     * @param name name
     * @return User
     */
    public List<User> getByUserName(String name) {
        return userRepository.selectByName(name);
    }
}

package com.lqli.learn;

import com.google.gson.Gson;
import com.lqli.learn.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 入口方法
 *
 * @author lqli
 */
public class Entrance {

    /**
     * main方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context/spring/applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(String.format("插入新用户which id:%s到数据库成功", userService.add("lqli")));
        System.out.println(String.format("查询用户名;%s的用户信息", new Gson().toJson(userService.getByUserName("lqli"))));
    }
}

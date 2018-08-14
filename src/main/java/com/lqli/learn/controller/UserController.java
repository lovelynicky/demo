package com.lqli.learn.controller;

import com.lqli.learn.domain.User;
import com.lqli.learn.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 控制层controller
 *
 * @author lqli
 * 通过注解 @Controller来定义一个控制层spring mvc bean
 * 通过注解 @RequstMapping来定义urlMapping
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 依赖注入userService
     */
    @Autowired
    private UserService userService;

    /**
     * 日志类
     */
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("index")
    public ModelAndView index() {
        logger.info("访问index");
        Map<String, User> user = new HashMap<String, User>();
        user.put("user", userService.getDefaultUser());
        return new ModelAndView("index", user);
    }
}

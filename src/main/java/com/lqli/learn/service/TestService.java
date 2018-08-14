package com.lqli.learn.service;

import org.springframework.stereotype.Service;

/**
 * 测试ifuwu
 * @author lqli
 */
@Service
public class TestService {
    /**
     * 内容
     */
    private String content = "默认打印";
    /**
     * 打印方法
     */
    public void print(){
        System.out.println(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

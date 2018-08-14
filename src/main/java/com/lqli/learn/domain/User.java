package com.lqli.learn.domain;

/**
 * 用户对象
 *
 * @author lqli
 */
public class User {
    /**
     * id
     */
    private long id;
    /**
     * 用户名
     */
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

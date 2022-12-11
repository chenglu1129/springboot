package com.itheima.domain;

import lombok.Data;

/**
 * @Author Cheng
 * @Date 2022 12 11 20 36
 **/
@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private String email;
    private Integer version;
}

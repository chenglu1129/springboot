package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.User;

/**
 * @Author Cheng
 * @Date 2022 12 12 13 28
 **/
public interface IUserService extends IService<User>{
    //追加的操作与原始操作通过名称区分，功能类似
    Boolean delete(Integer id);
    Boolean insert(User user);
    Boolean modify(User user);
    User get(Integer id);
    IPage<User> getPage(int currentPage, int pageSize);
    IPage<User> getPage(int currentPage, int pageSize, User user);



}

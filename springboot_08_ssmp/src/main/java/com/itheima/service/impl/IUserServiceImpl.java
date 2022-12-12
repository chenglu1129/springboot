package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Cheng
 * @Date 2022 12 12 13 29
 **/
@Service
public class IUserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Boolean delete(Integer id) {
        return userDao.deleteById(id) > 0;
    }

    @Override
    public Boolean insert(User user) {
        return userDao.insert(user) > 0;
    }

    @Override
    public Boolean modify(User user) {
        return userDao.updateById(user) > 0;
    }

    @Override
    public User get(Integer id) {
        return userDao.selectById(id);
    }

    @Override
    public IPage<User> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);
        userDao.selectPage(page,null);
        return page;
    }

    @Override
    public IPage<User> getPage(int currentPage, int pageSize, User user) {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.like(Strings.isNotEmpty(user.getName()),User::getName,user.getName());
        lqw.like(Strings.isNotEmpty(user.getEmail()),User::getEmail,user.getEmail());
        //lqw.like(Strings.isNotEmpty(user.getPassword(),User::getPassword,user.getPassword());
        IPage page = new Page(currentPage,pageSize);
        userDao.selectPage(page,lqw);
        return page;
    }
}

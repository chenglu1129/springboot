package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Cheng
 * @Date 2022 12 12 13 02
 **/
public interface UserService {
    Boolean save(User user);
    Boolean delete(Integer id);
    Boolean update(User user);
    User getById(Integer id);
    List<User> getAll();
    IPage<User> getPage(int currentPage, int size);

}

package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Cheng
 * @Date 2022 12 12 11 05
 **/
@Mapper
public interface UserDao extends BaseMapper<User> {
}

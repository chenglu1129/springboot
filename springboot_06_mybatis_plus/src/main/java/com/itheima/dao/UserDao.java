package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author Cheng
 * @Date 2022 12 11 20 40
 **/
@Mapper
public interface UserDao extends BaseMapper<User> {

}

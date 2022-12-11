package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @Author Cheng
 * @Date 2022 12 11 20 11
 **/
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save(){
        System.out.println("book dao is running...");
    }
}

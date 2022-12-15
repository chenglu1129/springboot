package com.itheima.controller.BAK;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Cheng
 * @Date 2022 12 15 18 07
 **/
public class BaseClass {
    private Class clazz ;
    public static Logger log ;

    public BaseClass(){
        clazz = this.getClass();
        log = LoggerFactory.getLogger(clazz);
    }

}

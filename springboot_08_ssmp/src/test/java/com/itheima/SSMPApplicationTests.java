package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.IUserService;
import com.itheima.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SSMPApplicationTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Autowired
    private IUserService iUserService;

//    @Test
//    void testSave() {
//        User user =new User();
//        user.setName("道德");
//        user.setUserName("sss");
//        user.setAge(33);
//        user.setEmail("83838@qq.com");
//        user.setPassword("767676");
//        userDao.insert(user);
//    }
//
//    @Test
//    void testselect() {
//        userDao.selectById(6);
//    }
//
//    @Test
//    void testGetById(){
//        userService.getById(2);
//    }
//
//    @Test
//    void testGetAll(){
//        userService.getAll();
//    }
//
//    @Test
//    void testGetByPage(){
//        userService.getPage(2,2);
//    }

}

package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.util.R;
import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @Author Cheng
 * @Date 2022 12 12 14 01
 **/
@RestController
@RequestMapping("/users")
public class UserController1 {
    @Autowired
    private IUserService userService;

    @GetMapping
    public R getAll(){
        return new R(true, userService.list());
    }

    @PostMapping
    public R save(@RequestBody User user) throws IOException {
//        R r = new R();
//        boolean flag = bookService.save(user);
//        r.setFlag(flag);
        if (user.getName().equals("123") ) throw new IOException();
        boolean flag = userService.save(user);
        return new R(flag, flag ? "添加成功^_^" : "添加失败-_-!");
    }

    @PutMapping
    public R update(@RequestBody User user) throws IOException {
        if (user.getName(). equals("123") ) throw new IOException();
        boolean flag = userService.modify(user);
        return new R(flag, flag ? "修改成功^_^" : "修改失败-_-!");
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(userService.delete(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, userService.getById(id));
    }

//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
//        IPage<User> page = userService.getPage(currentPage, pageSize);
//        //如果当前页码值大于了总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
//        if( currentPage > page.getPages()){
//            page = userService.getPage((int)page.getPages(), pageSize);
//        }
//        return new R(true, page);
//    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize,User user){
//        System.out.println("参数==>"+user);

        IPage<User> page = userService.getPage(currentPage, pageSize,user);
        //如果当前页码值大于了总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
        if( currentPage > page.getPages()){
            page = userService.getPage((int)page.getPages(), pageSize,user);
        }
        return new R(true, page);
    }
}

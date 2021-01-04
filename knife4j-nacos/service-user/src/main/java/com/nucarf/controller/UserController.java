package com.nucarf.controller;


import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.nucarf.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Api(tags = "用户模块")
@RestController
public class UserController {

    @ApiOperation(value = "用户列表")
    @PostMapping("userList")
    public List<User> userList(){
        User user1 = new User(1,"张三",20,"初级java开发工程师","阿里巴巴");
        User user2 = new User(2,"李四",21,"中级java开发工程师","百度");
        User user3 = new User(3,"王五",22,"高级java开发工程师","腾讯");
        User user4 = new User(4,"赵六",23,"资深java开发工程师","字节跳动");

        return Arrays.asList(user1,user2,user3,user4);
    }

    @ApiOperation(value = "根据id查询用户")
    @GetMapping("user")
    public User getUser(@RequestParam ("id") @ApiParam(value = "id值",name = "用户id",required = true) Integer id){

        User user = new User(4,"赵六",23,"资深java开发工程师","字节跳动");
        return user;
    }

    @ApiOperation("添加用户信息")
    @ApiOperationSupport(ignoreParameters = {"user.id"})//新增时，忽略id属性
    @PostMapping("addUser")
    public User addUser(@RequestBody User user){
        return user;
    }


}

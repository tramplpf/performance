package com.example.demo.base.controller.user;

import com.example.demo.base.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户管理相关的控制器
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    /**
     * 根据用户序号查询用户信息
     *
     * @param userId
     */
    @RequestMapping("getUserById")
    public void getUserById(Long userId){
        System.out.println("根据用户序号查询用户信息，userId = " + userId);
    }
}

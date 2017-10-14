package com.mybatis.controller.hessian;

import com.mybatis.domain.pen.CalmWangPenModel;
import com.mybatis.domain.user.CalmWangUserModel;
import com.mybatis.service.pen.CalmWangPenServiceI;
import com.mybatis.service.user.CalmWangUserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yunkai on 2017/9/19.
 */
@RestController
@RequestMapping("/hessian")
public class HessianController {

    @Autowired
    private CalmWangUserServiceI calmWangUserService;

    @Autowired
    private CalmWangPenServiceI calmWangPenService;

    @RequestMapping("/test")
    public List<CalmWangUserModel> test(){
        String name = "yunkai";
        List<CalmWangUserModel> users = calmWangUserService.getByName(name);
        return users;
    }

    @RequestMapping("/findUserListJson")
    public List<CalmWangUserModel> findUserListJson(){
        List<CalmWangUserModel> users = calmWangUserService.findUserList();
        return users;
    }

    @RequestMapping("/findUserPenListJson")
    public List<CalmWangPenModel> findUserPenListJson(){
        Short userId = 1;
        List<CalmWangPenModel> pens = calmWangPenService.findPenByUserID(userId);
        return pens;
    }
}

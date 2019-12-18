package com.fangyr.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.fangyr.core.entity.User;
import com.fangyr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:fangyurui
 * @Description:2
 * @Date:2019-12-17
 */
@RestController
@RequestMapping("/api/v1/")
@Component
public class ApiController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "/showUser", method = RequestMethod.POST)
    public String showUser(@RequestParam("id") Long id) {
        User user = userService.selectById(id);
        return user.getName();
    }

    @PostMapping(path = "/showUserAll")
    public String showUserAll() {
        List<User> userList = userService.selectAll();
        return JSONObject.toJSONString(userList);
    }


}

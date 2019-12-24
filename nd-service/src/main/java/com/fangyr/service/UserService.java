package com.fangyr.service;

import com.fangyr.core.entity.User;

import java.util.List;

/**
 * @Author:fangyurui
 * @Description:2
 * @Date:2019-12-17
 */
public interface UserService {

    User selectById(Long id);

    List<User> selectAll();

}

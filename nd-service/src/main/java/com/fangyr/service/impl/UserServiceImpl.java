package com.fangyr.service.impl;

import com.fangyr.core.entity.User;
import com.fangyr.dao.mapper.UserMapper;
import com.fangyr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:fangyurui
 * @Description:2
 * @Date:2019-12-17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectList(null);
    }
}

package com.newcoder.community.service;

import com.newcoder.community.dao.UserMapper;
import com.newcoder.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author feyfey
 * @create 2022/6/30
 * @University JiangHan Univiersity
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id)
    {
        User user = userMapper.selectById(id);
        return user;
    }



}

package com.xz.service.impl;

import com.xz.dao.UserDao;
import com.xz.domain.User;
import com.xz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /***
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    @Override
    public User findByUserId(Integer id) {
        return userDao.findById(id).get();
    }
}
package com.xz.service;

import com.xz.domain.User;

public interface UserService {
    /***
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    User findByUserId(Integer id);
}
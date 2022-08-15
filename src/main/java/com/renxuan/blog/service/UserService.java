package com.renxuan.blog.service;

import com.renxuan.blog.po.User;

/**
 * @author RenXuan
 */
public interface UserService {

    User checkUser(String username,String password);
}

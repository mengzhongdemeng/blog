package com.renxuan.blog.service;

import com.renxuan.blog.dao.UserRepository;
import com.renxuan.blog.po.User;
import com.renxuan.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author RenXuan
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String username, String password) {

        User user=userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));

        return user;
    }

}

package com.renxuan.blog.dao;

import com.renxuan.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author RenXuan
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);
}

package com.myharbour.ems_thymeleaf.dao;

import com.myharbour.ems_thymeleaf.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {
    void save(User user);
    User login(@Param("username") String username, @Param("password") String password);
}

package com.myharbour.ems_thymeleaf.service;

import com.myharbour.ems_thymeleaf.entity.User;

public interface UserService {
    void register(User user);

    User login(String username,String password);
}

package com.systemplant.cake_web_system.service;

import com.systemplant.cake_web_system.Entity.User;
import com.systemplant.cake_web_system.pojo.UserPojo;

import java.util.List;

public interface UserService {
    List<User> fetchAll();

    String saveUser (UserPojo userPojo);

    User fetchById(Integer id);

    void deleteById(Integer id);
}

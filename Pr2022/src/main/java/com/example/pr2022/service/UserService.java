package com.example.pr2022.service;

import com.example.pr2022.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Integer id);

    User create(User resource);
}

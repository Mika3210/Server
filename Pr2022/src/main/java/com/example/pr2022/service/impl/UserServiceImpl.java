package com.example.pr2022.service.impl;

import com.example.pr2022.model.User;
import com.example.pr2022.repository.UserRepository;
import com.example.pr2022.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        List<User> Users = repository.findAll();
        return repository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public User create(User resource) {
        return repository.saveAndFlush(resource);
    }
}

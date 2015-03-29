package com.brofindr.application.controller;

import com.brofindr.application.repository.UserRepository;
import com.brofindr.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/")
    public Iterable<User> test() {
        return userRepository.findAll();
    }
}

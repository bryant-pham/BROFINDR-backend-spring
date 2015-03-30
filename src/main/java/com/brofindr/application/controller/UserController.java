package com.brofindr.application.controller;

import com.brofindr.application.repository.UserRepository;
import com.brofindr.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static com.brofindr.application.controller.Routes.*;

@RestController
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = REGISTER_PATH, method = POST)
    public User register(@RequestBody User user) {
        return userRepository.save(user);
    }

    @RequestMapping(value = "/")
    public Iterable<User> test() {
        return userRepository.findAll();
    }
}

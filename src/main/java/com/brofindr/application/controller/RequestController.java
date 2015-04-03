package com.brofindr.application.controller;

import com.brofindr.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    private UserRepository userRepository;

    @Autowired
    public RequestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
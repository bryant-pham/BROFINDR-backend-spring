package com.brofindr.application.service;

import com.brofindr.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {
    private UserRepository userRepository;

    @Autowired
    public RequestService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}

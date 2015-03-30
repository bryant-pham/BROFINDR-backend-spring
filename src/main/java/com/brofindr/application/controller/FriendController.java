package com.brofindr.application.controller;

import com.brofindr.application.repository.FriendRepository;
import com.brofindr.domain.dto.FriendDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendController {
    private FriendRepository friendRepository;

    @Autowired
    public FriendController(FriendRepository friendRepository) {
        this.friendRepository = friendRepository;
    }

    @RequestMapping(value = Routes.FIND_FRIENDS_PATH, method = RequestMethod.GET)
    public List<FriendDto> findAllFriends(@PathVariable String userEmail) {
        return friendRepository.findByUserEmail(userEmail);
    }
}

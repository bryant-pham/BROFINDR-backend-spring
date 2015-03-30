package com.brofindr.application.repository;

import com.brofindr.domain.dto.FriendDto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FriendRepository extends CrudRepository<FriendDto, Long> {
    List<FriendDto> findByUserEmail(String userEmail);
}

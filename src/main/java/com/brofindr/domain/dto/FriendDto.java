package com.brofindr.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "friend")
public class FriendDto {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String userEmail;
    private String friendEmail;

    public FriendDto(String userEmail, String friendEmail) {
        this.userEmail = userEmail;
        this.friendEmail = friendEmail;
    }
}

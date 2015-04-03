package com.brofindr.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Request {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String senderEmail;
    private String recipientEmail;
    private String lat;
    private String lon;

    public Request(String senderEmail, String recipientEmail, String lat, String lon) {
        this.senderEmail = senderEmail;
        this.recipientEmail = recipientEmail;
        this.lat = lat;
        this.lon = lon;
    }
}

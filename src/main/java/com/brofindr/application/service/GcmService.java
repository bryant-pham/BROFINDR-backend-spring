package com.brofindr.application.service;

import com.brofindr.domain.dto.GcmRequest;
import com.brofindr.support.GcmConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GcmService {
    private RestTemplate restTemplate;

    @Autowired
    public GcmService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void sendPushNotification() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "key=" + GcmConstants.GCM_API_KEY);
        List<String> registrationIds = new ArrayList<>();
        registrationIds.add("APA91bGYH9KO4tFvpjRgQ7fzGx8wGhAqB4MgmfH9NU2rIRnK7gmXB8M09qnwVslvjrpafNwHO9ZFJ49qpnAkJfEXeqV0YAy_E7K9Nys4s6tMBavtdudDYvkV3L64Gv9ASJE_PoTSNrOs8z9djLZID6kmI4nJBebT2g");
        Map<String, String> dataMap = new HashMap<>();
        GcmRequest gcmRequest = new GcmRequest(registrationIds, dataMap);
        HttpEntity<?> request = new HttpEntity<>(gcmRequest, headers);

        restTemplate.exchange(GcmConstants.GCM_PATH, HttpMethod.POST, request, String.class);
    }
}

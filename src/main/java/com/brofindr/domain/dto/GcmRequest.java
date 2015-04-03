package com.brofindr.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Setter
@Getter
public class GcmRequest {
    private List<String> registration_ids;
    private Map<String, String> data;

    public GcmRequest(List<String> registration_ids, Map<String, String> data) {
        this.registration_ids = registration_ids;
        this.data = data;
    }
}

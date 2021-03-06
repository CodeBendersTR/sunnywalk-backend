package com.codebenders.sunnywalkbackend.model;

import javax.persistence.*;

@Entity(name = "api_key")
@Table(name = "api_key")
public class ApiKey {
    @Id
    @Column(name = "api_service")
    String service;

    @Column(name = "api_key")
    String apiKey;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}

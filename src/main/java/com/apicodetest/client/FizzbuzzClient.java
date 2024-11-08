package com.apicodetest.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.net.http.HttpClient;

public class FizzbuzzClient {

    @Value("${REMOTE_BASE_URI:http://localhost:3000}")
    String baseURI;

    @Bean
    HttpClient httpClient() {
        return HttpClient.newBuilder().build();
    }

    public FizzbuzzClient() {

    }

    public void get() {

    }
}

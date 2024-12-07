package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@Service
public class CommentService {

    @Autowired
    private RestTemplate restTemplate;

    private final String API_URL = "https://jsonplaceholder.typicode.com/comments";

    public ResponseEntity<String> getAllComments() {
        return restTemplate.getForEntity(API_URL, String.class);
    }
}

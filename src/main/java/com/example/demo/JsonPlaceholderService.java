package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class JsonPlaceholderService {
    public Post[] getPosts() {
        RestTemplate rt = new RestTemplate();

        String url = "https://jsonplaceholder.typicode.com/posts";

        ResponseEntity<Post[]> result = rt.getForEntity(url, Post[].class);

        return result.getBody();
    }
}
package com.example.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class JsonPlaceholderService {
    public JsonNode getPosts() {
        RestTemplate rt = new RestTemplate();

        String url = "https://jsonplaceholder.typicode.com/posts";

        String result = rt.getForObject(url, String.class);

        System.out.println(result);

        ObjectMapper mapper = new ObjectMapper();

        JsonNode output = mapper.createObjectNode();

        return output;
    }
}
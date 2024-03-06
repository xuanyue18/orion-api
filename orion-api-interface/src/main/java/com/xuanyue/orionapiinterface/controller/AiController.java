package com.xuanyue.orionapiinterface.controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;

/**
 * @author xuanyue_18
 * @date 2024/1/15 22:07
 */

@RestController
public class AiController {

    @Value("${gpt.base-url}")
    private String baseUrl;

    @Value("${gpt.access-token}")
    private String accessToken;

    @PostMapping("/api/chat")
    public String chatWithApi(HttpServletRequest request) {

        // Read the body from the HttpServletRequest
        String body = URLDecoder.decode(request.getHeader("body")); // Assuming body is sent as a header

        // Build the request
        HttpResponse httpResponse = HttpRequest.post(baseUrl + "/v1/chat/completions")
                .header("Authorization", "Bearer " + accessToken)
                .header("Content-Type", "application/json")
                .body(body)
                .execute();

        // Return the response body
        return httpResponse.body();
    }
}


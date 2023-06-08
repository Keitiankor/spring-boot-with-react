package com.example.springbootwithreact.test.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @RequestMapping("/v1")
    public Map<String, Object> testHandler() {
        Map<String, Object> res = new HashMap<>();
        res.put("RESPONSE", true);
        res.put("RESPONSE_OK", "SUCESS");
        return res;
    }
}

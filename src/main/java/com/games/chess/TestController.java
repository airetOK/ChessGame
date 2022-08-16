package com.games.chess;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/test")
    public Map<String, String> thymeleafView() {
        return Collections.singletonMap("id", "2123");

    }

    @PostMapping("/test")
    public String post(@RequestBody Map<String, String> map) {
        System.out.println(map);
        return "success";
    }
}

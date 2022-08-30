package com.games.chess;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class TestController {

    @GetMapping("/test")
    public String thymeleafView() {
        return "game";

    }

    @PostMapping("/test")
    public String post(@RequestBody Map<String, String> map) {
        System.out.println(map);
        return "success";
    }
}

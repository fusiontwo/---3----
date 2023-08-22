package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
// URL 연결 요청(@GetMapping())과 동시에 자동으로 임포트
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou() {
        return "greetings";  // greetings.mustache 파일 반환
    }
}

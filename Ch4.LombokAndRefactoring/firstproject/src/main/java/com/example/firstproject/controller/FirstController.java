package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
// URL 연결 요청(@GetMapping())과 동시에 자동으로 임포트
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        // model 객체가 "홍팍" 값을 "username"에 연결해 웹 브라우저로 보냄.
        model.addAttribute("username", "hongpark");
        return "greetings";  // greetings.mustache 파일 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "홍길동");
        return "goodbye";  // goodbye.mustache 파일 반환
    }
}

package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChooseController {

    @GetMapping("/")
    public String Choose() {

        return "home";
    }

    @GetMapping("/letter")
    public String Letter() {

        return "letter";
    }
}

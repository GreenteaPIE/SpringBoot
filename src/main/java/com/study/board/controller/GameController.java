package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GameController {

    private int targetNumber = (int) (Math.random() * 100);

    @GetMapping("/")
    public String game(Model model) {
        model.addAttribute("message", "1부터 100 사이의 숫자를 추측해보세요.");
        return "game";
    }

    @PostMapping("/guess")
    public String guessNumber(@RequestParam int number, Model model) {
        String message;
        if (number < targetNumber) {
            message = "추측한 숫자가 작습니다.";
        } else if (number > targetNumber) {
            message = "추측한 숫자가 큽니다.";
        } else {
            message = "축하합니다! 숫자를 맞췄습니다.";
        }
        model.addAttribute("message", message);
        return "game";
    }
}

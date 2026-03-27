package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("fullName", "Bùi Tuấn Kiệt");
        model.addAttribute("title", "Backend Developer (Java)");
        model.addAttribute("bio", "Xin chào! Tôi là Bùi Tuấn Kiệt, đam mê phát triển phần mềm, thích xây dựng ứng dụng web và học công nghệ mới.");
        model.addAttribute("location", "TP. Hồ Chí Minh, Việt Nam");
        model.addAttribute("email", "kietbuituan20@gmail.com");
        model.addAttribute("phone", "+84 123 456 789");
        model.addAttribute("skills", new String[]{"Java", "Spring Boot", "HTML/CSS/JS", "Thymeleaf"});
        return "index";
    }
}

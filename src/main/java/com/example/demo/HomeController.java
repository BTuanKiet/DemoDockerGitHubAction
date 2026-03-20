package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("fullName", "Nguyễn Văn A");
        model.addAttribute("title", "Developer / Học viên Java");
        model.addAttribute("bio", "Xin chào! Tôi là Nguyễn Văn A, đam mê phát triển phần mềm, thích xây dựng ứng dụng web và học công nghệ mới.");
        model.addAttribute("location", "Hà Nội, Việt Nam");
        model.addAttribute("email", "nguyenvana@example.com");
        model.addAttribute("phone", "+84 123 456 789");
        model.addAttribute("skills", new String[]{"Java", "Spring Boot", "HTML/CSS/JS", "Thymeleaf"});
        return "index";
    }
}

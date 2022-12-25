package com.example.demo.Controller;

import com.example.demo.dto.Mb;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloModelController {

    @GetMapping("model")
    public String helloView(Model model) {

        // Model에 데이터 저장
        model.addAttribute("msg", "타임리프 고고");
        model.addAttribute("name", "히트다");

        return "hello";
    }
}

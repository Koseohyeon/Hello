package inha.cse.spring.hello.controller;

import jakarta.el.EvaluationListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public Point hello(Model model){

        Point p = new Point(10, 20);
//        model.addAttribute("data",p);

        return p;
    }
}


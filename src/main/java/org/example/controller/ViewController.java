package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/pontosturisticos")
    public String pontosturisticos(){
        return "pontosturisticos";
    }
}

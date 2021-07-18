package com.sh.springjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("index")
    public String Index(Model model){

        model.addAttribute("data", "Hello!");
        return "index";
    }

    @GetMapping("param")
    public String param(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);

        return "param";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello" + name;
    }
}

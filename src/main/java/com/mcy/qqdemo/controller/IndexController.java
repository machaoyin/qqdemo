package com.mcy.qqdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @GetMapping({"/index", "/"})
    public String index(){
        return "index";
    }

    @GetMapping("/home")
    public String home(HttpSession session, Model model){
        String openid = (String) session.getAttribute("openid");
        String nickname = (String) session.getAttribute("nickname");
        String figureurl_qq_2 = (String) session.getAttribute("figureurl_qq_2");

        model.addAttribute("openid",openid);
        model.addAttribute("nickname",nickname);
        model.addAttribute("figureurl_qq_2",figureurl_qq_2);

        return "home";
    }
}

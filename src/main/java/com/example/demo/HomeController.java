package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping("home")
    public String home( HttpServletRequest req ){
        HttpSession session = req.getSession();
        session.getAttribute("message");
        return "index";
    }
    @RequestMapping("about")
    public ModelAndView about( Feedback feedback ){
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", feedback);
        mv.setViewName("about");
        return mv;
    }
}

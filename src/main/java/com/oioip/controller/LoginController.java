package com.oioip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
        if (username!=null&&"123456".equals(password)){
            //添加用户名到session域中存储
            session.setAttribute("loginUser",username);
            return "redirect:/main";
        }else {
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
    }
}

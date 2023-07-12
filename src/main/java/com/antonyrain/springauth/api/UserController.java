package com.antonyrain.springauth.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping("admin")
    public String getAdmin() {
        return "admin";
    }

    @GetMapping("moderator")
    public String getModerator() {
        return "moderator";
    }

    @GetMapping("user")
    public String getUser() {
        return "user";
    }

}
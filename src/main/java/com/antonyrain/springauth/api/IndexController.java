package com.antonyrain.springauth.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class IndexController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}

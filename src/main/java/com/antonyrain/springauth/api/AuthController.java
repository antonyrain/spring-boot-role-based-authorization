package com.antonyrain.springauth.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

import com.antonyrain.springauth.domain.LoginRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

     @GetMapping("logged")
    public String logged() {
        return "logged";
    }

    @GetMapping("logout")
    public String logout() {
        return "logout";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @PostMapping("login")
    // public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
    public String authenticateUser(@RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                loginRequest.getUsername(), 
                loginRequest.getPassword()
            )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        
        // MyUserDetails userDetails = (MyUserDetails) authentication.getPrincipal();    
        // List<String> roles = userDetails.getAuthorities().stream()
        //     .map(item -> item.getAuthority())
        //     .collect(Collectors.toList());

        // return ResponseEntity.ok(roles);
        return "Ok";
    }
}

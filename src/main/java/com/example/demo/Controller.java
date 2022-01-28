package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	

    @GetMapping("/")
    public String admin(){
    	System.out.print("abc");

        return "This is Admin Page";
    }
    
   

    @GetMapping("/home")
    public String login(@RequestBody User user){
    	System.out.print("abc");
    	boolean isLoginSuccessful = LoginDao.validate(user);
    	
    	if(isLoginSuccessful) {
    		return "Successful";
    	}
    	return "LoginFailed";
    }
    @CrossOrigin(origins = {"http://localhost:3000"})
    @PostMapping("/register")
    public String register(@RequestBody User user){
    	System.out.print("abc");
    	String message = LoginDao.insert(user);
    	
    	return message;
    }
    
}
package com.jtech.userservice.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class RoleController {
  
    @GetMapping("/")
      public String greeting() {
        return "User added successfully............";
      }
}


	

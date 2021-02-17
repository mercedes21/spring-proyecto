/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adventOfCode.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author chapis
 */
@Controller
public class HelloController {
    
  /* @RequestMapping("/hello")
    public String showHello(Model model){
        model.addAttribute("saludo", "Mi primera aplicacion web Spring Boot");
        return "hello";
    }*/
     @GetMapping("otra")
	 public String login()
	 {		
		 return "hello";
	 } 
    
}

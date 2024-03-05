package com.basic.securitydemo.bsd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UnSecureController {


      @GetMapping("/home")
      public String getHomePage() {
          return "home";
      }
      

}

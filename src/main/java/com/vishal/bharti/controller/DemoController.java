package com.vishal.bharti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


   @GetMapping(value = "/test")
   public String checkApplication(){
       return "Application Version *V1* is working Fine";
    }
}

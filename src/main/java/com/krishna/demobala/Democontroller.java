package com.krishna.demobala;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {
    @RequestMapping("/")
    public String index(){
        return "My first spring boot application Bala....!!!!!!";
    }
}

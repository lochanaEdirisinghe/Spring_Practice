package lk.lochana.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/controller2")
public class SpringController2 {

    @GetMapping(path = "/id")
    public String getMyName1(){
        return "ID Method";
    }

    @GetMapping(path = "/name")
    public String getMyName2(){
        return "Name Method";
    }
}

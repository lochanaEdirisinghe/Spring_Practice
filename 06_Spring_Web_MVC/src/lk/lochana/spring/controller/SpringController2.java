package lk.lochana.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/controller2")
public class SpringController2 {

    @GetMapping
    public String getMyName(){
        return "Default Method";
    }

    @GetMapping(path = "/{id}/{name}/{address}")
    public String getMyName(@PathVariable String id, @PathVariable String name, @PathVariable String address){
        return id+" "+name+" "+address;
    }

    @GetMapping(path = "/id")
    public String getMyName1(){
        return "ID Method";
    }

    @GetMapping(path = "/name")
    public String getMyName2(){
        return "Name Method";
    }
}

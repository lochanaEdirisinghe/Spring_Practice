package lk.lochana.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
@CrossOrigin
@RequestMapping("/api/v1/controller")
public class SpringController {

    @GetMapping
    public String getResponse(){
        return "Get Mapping";
    }

    @PostMapping
    public String PostResponse(){
        return "Post Mapping";
    }

    @PutMapping
    public String putResponse(){
        return "Put Mapping";
    }

    @DeleteMapping
    public String deleteResponse(){
        return "Delete Mapping";
    }
}

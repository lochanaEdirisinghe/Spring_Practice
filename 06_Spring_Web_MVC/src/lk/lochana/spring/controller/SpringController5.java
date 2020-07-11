package lk.lochana.spring.controller;


import com.sun.xml.internal.ws.api.pipe.ContentType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.lang.reflect.Method;

@RestController
@CrossOrigin
@RequestMapping("api/v1/c5")
public class SpringController5 {

    @GetMapping(path = "/a", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String MethodOne(){
        return "{\"id\":\"C001\"}";
    }


    @GetMapping(path = "/a", consumes = {MediaType.TEXT_PLAIN_VALUE})
    public String MethodTwo(){
        return "plane text called";
    }

}

package lk.lochana.spring.Controllers;

import com.sun.xml.internal.ws.api.pipe.ContentType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/controller")
public class SpringController {

    @GetMapping(path = "/{id}/{name}")
    public String testController(@PathVariable("id") String id, @PathVariable("name") String name){
        return id+" "+name;
    }

    @GetMapping(path = "/c?1")
    public String C(){
        return "hello";
    }
    @GetMapping(path = "/id/*/name")
    public String C2(){
        return "hello2";
    }
    @GetMapping(path = "/id/**/name")
    public String C3(){
        return "hello3";
    }

    @GetMapping(path = "/{id:[C]{1}[0-9]{3}}")
    public String C4(@PathVariable String id){
        return id;
    }

    @GetMapping(params = {"id"})
    public String C5(){
        return "hello params";
    }
    @GetMapping(params = {"id", "name"})
    public String C6(@RequestParam("id") String Cid, @RequestParam("name") String Cname){
        return Cid+" "+Cname;
    }

    @GetMapping(path = "/a" ,consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.TEXT_PLAIN_VALUE})
    public String C6(){
        return "hello params";
    }
}

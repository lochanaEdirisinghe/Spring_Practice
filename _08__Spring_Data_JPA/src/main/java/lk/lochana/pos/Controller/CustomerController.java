package lk.lochana.pos.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/controller")
public class CustomerController {
    @GetMapping
    public String getText(){
        return "Hello Spring";
    }
}

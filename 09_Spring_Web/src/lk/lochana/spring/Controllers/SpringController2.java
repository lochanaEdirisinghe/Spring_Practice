package lk.lochana.spring.Controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/c2")
public class SpringController2 {

    @GetMapping
    public CustomerDto getCustomer(CustomerDto dto){
        return dto;
    }
}

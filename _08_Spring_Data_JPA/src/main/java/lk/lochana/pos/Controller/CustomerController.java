package lk.lochana.pos.Controller;

import lk.lochana.pos.dto.CustomerDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/controller")
public class CustomerController {

    @GetMapping
    public CustomerDto getCustomer(CustomerDto dto){
        return dto;
    }
}

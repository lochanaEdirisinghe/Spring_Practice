package lk.lochana.pos.Controllers;

import lk.lochana.pos.dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @GetMapping(path = "/json")
    public CustomerDto getCustomer(@RequestBody CustomerDto dto){
        return dto;
    }

    @GetMapping(path = "/www")
    public CustomerDto getCustomer2(@ModelAttribute CustomerDto dto){
        return dto;
    }
}

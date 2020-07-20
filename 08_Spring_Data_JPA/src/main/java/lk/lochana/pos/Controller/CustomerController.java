package lk.lochana.pos.Controller;

import lk.lochana.pos.Dto.CustomerDto;
import lk.lochana.pos.Entity.Customer;
import lk.lochana.pos.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping
    public void getCustomer(@RequestParam CustomerDto dto){
        Customer c= new Customer(dto.getId(), dto.getName(), dto.getAddress());
        service.saveCustomer(c);
    }
}

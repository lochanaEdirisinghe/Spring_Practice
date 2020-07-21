package lk.lochana.spring.Controller;


import lk.lochana.spring.Entity.Customer;
import lk.lochana.spring.Service.CustomerService;
import lk.lochana.spring.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/controller")
public class CustomerController {

   @Autowired
   CustomerService customerService;

    @GetMapping
    public void getCustomer(@RequestBody CustomerDto dto){
        Customer c = new Customer(dto.getId(), dto.getName(), dto.getAge());
        customerService.saveCustomer(c);
    }
}

package lk.lochana.spring.controller;


import lk.lochana.spring.Dto.CustomerDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/c6")
public class SpringController6 {

    @GetMapping
    public CustomerDto sendCustomr(CustomerDto dto){
        return dto;
    }

}

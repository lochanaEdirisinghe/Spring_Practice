package lk.lochana.spring.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/c3")
public class SpringController3 {

    @GetMapping(path = "/C?1")
    public String MethodOne(){
        return "Hello Spring 1";
    }

    @GetMapping(path = "/C??2")
    public String MethodTwo(){
        return "Hello Spring 2";
    }

    @GetMapping(path = "/id/*/name")
    public String MethodThree(){
        return "Hello Spring 3";
    }

    /*/id/kdkdjj/name*/
    @GetMapping(path = "/id/*/*/name")
    public String MethodFour(){
        return "Hello Spring 4";
    }

    /*/id/ddf/ffdfd/fdfdf/name*/
    @GetMapping(path = "/id/**/name")
    public String MethodFive(){
        return "Hello Spring 5";
    }

    //reguler expression
    @GetMapping(path = "/{id:[C]{1}[0-9]{3}}")
    public String MethodSix(@PathVariable String id){
        return id;
    }
}

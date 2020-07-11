package lk.lochana.spring.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/c4")
public class SpringController4 {

    @GetMapping(params = {"id"})
    public String MethodOne(){
        return "Hello Spring 1";
    }


    /*@GetMapping(params = {"id", "name"})
    public String MethodTwo(){
        return "Hello Spring 2";
    }
*/

    @GetMapping(params = {"id=C001"})
    public String MethodThree(){
        return "Hello Spring 3";
    }

    @GetMapping(params = {"id", "name"})
    public String MethodFour(@RequestParam("id") String id, @RequestParam("name") String name){

        return id+" "+name;
    }

}

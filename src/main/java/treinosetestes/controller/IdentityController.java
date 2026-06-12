package treinosetestes.controller;

import org.springframework.web.bind.annotation.*;
import treinosetestes.model.entities.Identity;

@RestController
@RequestMapping(path = "/ident")
public class IdentityController {

    @GetMapping("/get")
    public Identity getIdentity(){
        return new Identity(1,"Paulo",56);
    }

    @PostMapping("/post")
    public Identity postIdentity(){
        return new Identity(2,"Rogério",40);
    }

    @GetMapping
    public Identity getIdentityById(@RequestParam(name = "id", defaultValue = "1") int id){
        return new Identity(id,"Márcia",57);
    }


}

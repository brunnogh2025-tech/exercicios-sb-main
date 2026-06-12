package treinosetestes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/1")
    public int mensagem(){
        return 1;
    }

    @GetMapping(path = "/0")
    public int mensagem2(){
        return 0;
    }

    @PostMapping(path = "/2")
    public String mensagemError() {return "2";}
}

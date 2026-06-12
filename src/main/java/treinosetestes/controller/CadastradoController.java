package treinosetestes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import treinosetestes.model.entities.Cadastrado;
import treinosetestes.model.repositories.RepoCadastrado;

@RestController
@RequestMapping(path = "/teste/cadastro")
public class CadastradoController {

    @Autowired
    RepoCadastrado repoCadastrado;

    @PostMapping
    public @ResponseBody Cadastrado cadastrar(@RequestParam String nome, @RequestParam int idade){
        Cadastrado cadastrado = new Cadastrado(nome, idade);
        repoCadastrado.save(cadastrado);
        return cadastrado;
    }
}

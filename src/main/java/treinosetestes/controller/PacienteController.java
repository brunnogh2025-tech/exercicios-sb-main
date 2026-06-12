package treinosetestes.controller;

import com.example.exerciciossb.models.entities.Produto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import treinosetestes.model.entities.Paciente;
import treinosetestes.model.repositories.RepositorioPaciente;

import java.util.Optional;

@RestController
@RequestMapping(path = "/paciente")
public class PacienteController {
    @Autowired
    private RepositorioPaciente repositorioPaciente;

    @GetMapping(path = "/{id}")
    public Optional<Paciente> getPaciente(@PathVariable Long id){
        return repositorioPaciente.findById(id);
    }

    @GetMapping
    public @ResponseBody Iterable<Paciente> getAllPacientes(){
        return repositorioPaciente.findAll();
    }

    @PostMapping
    public @ResponseBody Paciente savePaciente(@RequestBody Paciente paciente){
        repositorioPaciente.save(paciente);
        return paciente;
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody Paciente updatePaciente(@RequestBody Paciente paciente, @PathVariable Long id){
        paciente.setId(id);
        repositorioPaciente.save(paciente);
        return paciente;
    }
    @DeleteMapping(path = "/{id}")
    public @ResponseBody Optional<Paciente> deletePaciente(@PathVariable Long id){
        Optional<Paciente> paciente = repositorioPaciente.findById(id);
        repositorioPaciente.deleteById(id);
        return paciente;
    }
}

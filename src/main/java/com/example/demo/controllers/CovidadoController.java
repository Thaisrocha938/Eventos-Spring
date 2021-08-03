package com.example.demo.controllers;

import com.example.demo.models.Convidados;
import com.example.demo.services.ConvidadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/agenda")
public class CovidadoController {

    @Autowired
    ConvidadosService convidadosService;

    @GetMapping("/convidados")
    public List<Convidados> viewConvidados(){
        return convidadosService.listarConvidados();
    }
    @GetMapping("/convidado/{id}")
    public Optional<Convidados> viewConvidado(@PathVariable long id){
        return convidadosService.listarUnicoConvidado(id);
    }

    @PostMapping("/convidado")
    public Convidados saveConvidado(@RequestBody Convidados convidado){
        return convidadosService.salvarConvidado(convidado);
    }
    @DeleteMapping("/convidado")
    public void deleteConvidado(@RequestBody Convidados convidado){
        convidadosService.excluirConvidado(convidado);
    }
    @PutMapping("/convidado")
    public Convidados uploadConvidado(@RequestBody Convidados convidado){
        return convidadosService.alterarConvidado(convidado);
    }

}

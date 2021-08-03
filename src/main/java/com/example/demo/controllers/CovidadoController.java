package com.example.demo.controllers;

import com.example.demo.models.Convidados;
import com.example.demo.repositories.ConvidadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CovidadoController {

    @Autowired
    ConvidadosRepository convidadosRepository;

   /* @GetMapping("/{id}/convidados")
    public List<Convidados> listarConvidadosEventoUnico(@PathVariable long id){
        return convidadosRepository.findAllConvidadosByEventoId(id);
    }*/
    @GetMapping("/convidados")
    public List<Convidados> listarConvidadosEventoUnico(){
        return convidadosRepository.findAll();
    }
    @PostMapping("/convidado")
    public Convidados savarConvidado(@RequestBody Convidados convidado){
        return convidadosRepository.save(convidado);
    }
    @PutMapping("/convidado")
    public Convidados alterarConvidado(@RequestBody Convidados convidado){
        return convidadosRepository.save(convidado);
    }

}

package com.example.demo.controllers;

import com.example.demo.models.Eventos;
import com.example.demo.repository.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
class EventosController {
    @Autowired
    EventosRepository eventosRepository;

    @GetMapping("/eventos")
    public List<Eventos> listarEventos(){
        return eventosRepository.findAll();
    }

    @GetMapping("/evento/{id}")
    public Eventos listarEventoUnico(@PathVariable long id){
        return eventosRepository.findById(id);
    }

    @PostMapping("/evento")
    public Eventos salvarEvento(@RequestBody Eventos eventos){
        return eventosRepository.save(eventos);
    }

    @DeleteMapping("/evento")
    public void deletaEvento(@RequestBody Eventos eventos){
       eventosRepository.delete(eventos);
    }

    @PutMapping("/evento")
    public Eventos atualizarEvento(@RequestBody Eventos eventos){
        return eventosRepository.save(eventos);
    }
}

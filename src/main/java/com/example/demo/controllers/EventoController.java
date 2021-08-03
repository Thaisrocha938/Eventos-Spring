package com.example.demo.controllers;

import com.example.demo.models.Eventos;
import com.example.demo.services.EventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/agenda")
class EventosController {
    @Autowired
    EventosService eventosService;

    @GetMapping("/eventos")
    public List<Eventos> visitEventos(){
        return eventosService.listarTodosEventos();
    }

    @GetMapping("/{id}")
    public Optional<Eventos> viewEvento(@PathVariable long id){
        return eventosService.listarEventoUnico(id);
    }

    @PostMapping("/evento")
    public Eventos saveEvento(@RequestBody Eventos eventos){
        return eventosService.salvarEvento(eventos);
    }

    @DeleteMapping("/evento")
    public void deletaEvento(@RequestBody Eventos eventos){
       eventosService.deletaEvento(eventos);
    }

    @PutMapping("/evento")
    public Eventos uploadEvento(@RequestBody Eventos eventos){
        return eventosService.atualizarEvento(eventos);
    }
}

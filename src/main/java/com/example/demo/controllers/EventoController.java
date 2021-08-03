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
    public List<Eventos> viewEventos(){
        return eventosService.listarTodosEventos();
    }

    @GetMapping("/evento/{id}")
    public Optional<Eventos> viewEvento(@PathVariable long id){
        return eventosService.listarEventoUnico(id);
    }

    @PostMapping("/criar_evento")
    public Eventos saveEvento(@RequestBody Eventos eventos){
        return eventosService.salvarEvento(eventos);
    }

    @DeleteMapping("/deletar_evento")
    public void deleteEvento(@RequestBody Eventos eventos){
       eventosService.deletaEvento(eventos);
    }

    @PutMapping("/alterar_evento")
    public Eventos uploadEvento(@RequestBody Eventos eventos) {
        return eventosService.atualizarEvento(eventos);
    }
}

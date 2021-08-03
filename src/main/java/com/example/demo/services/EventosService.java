package com.example.demo.services;

import com.example.demo.models.Eventos;
import com.example.demo.repositories.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EventosService {
    @Autowired
    EventosRepository eventosRepository;

    public List<Eventos> listarTodosEventos() {
        return eventosRepository.findAll();
    }

    public Optional<Eventos> listarEventoUnico(long id) {
        return eventosRepository.findById(id);
    }

    public Eventos salvarEvento( Eventos eventos){
        return eventosRepository.save(eventos);
    }

    public void deletaEvento(Eventos eventos){
        eventosRepository.delete(eventos);
    }

    public Eventos atualizarEvento( Eventos eventos){
        return eventosRepository.save(eventos);
    }
}
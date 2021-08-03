package com.example.demo.services;

import com.example.demo.models.Convidados;
import com.example.demo.repositories.ConvidadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ConvidadosService {
    @Autowired
    ConvidadosRepository convidadosRepository;
    public List<Convidados> listarConvidados(){
        return convidadosRepository.findAll();
    }
    public Optional<Convidados> listarUnicoConvidado(long id){
        return convidadosRepository.findById(id);
    }
    public Convidados salvarConvidado(Convidados convidado){
        return convidadosRepository.save(convidado);
    }
    public void excluirConvidado(Convidados convidado){
        convidadosRepository.delete(convidado);
    }

    public Convidados alterarConvidado(Convidados convidado){
        return convidadosRepository.save(convidado);
    }

}


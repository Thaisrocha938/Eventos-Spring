package com.example.demo.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Convidados implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private long rg;
    private String nomeConvidado;

    @ManyToOne
    private Eventos evento;

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }

    public Eventos getEvento() {
        return evento;
    }

    public void setEvento(Eventos evento) {
        this.evento = evento;
    }
}

package com.example.demo.models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Convidados implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private long rg;
    private String nomeConvidado;

    @ManyToOne
    @NotNull
    private Eventos evento;

}

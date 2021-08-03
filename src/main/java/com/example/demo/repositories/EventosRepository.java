package com.example.demo.repositories;

import com.example.demo.models.Eventos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventosRepository extends JpaRepository<Eventos, Long> {

}

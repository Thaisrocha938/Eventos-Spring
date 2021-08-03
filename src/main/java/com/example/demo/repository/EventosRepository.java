package com.example.demo.repository;

import com.example.demo.models.Eventos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventosRepository extends JpaRepository<Eventos, Long> {
   Eventos findById(long id);
}

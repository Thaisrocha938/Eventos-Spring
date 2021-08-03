package com.example.demo.repositories;

import com.example.demo.models.Convidados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvidadosRepository extends JpaRepository<Convidados, Long> {
}

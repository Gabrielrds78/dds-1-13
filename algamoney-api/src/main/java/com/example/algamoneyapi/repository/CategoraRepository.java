package com.example.algamoneyapi.repository;

import com.example.algamoneyapi.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoraRepository extends JpaRepository<Categoria, Long> {
}

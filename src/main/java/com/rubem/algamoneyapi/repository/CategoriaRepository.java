package com.rubem.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubem.algamoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long>{

}

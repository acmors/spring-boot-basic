package com.acmors.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acmors.festa.model.Convidado;

public interface ConvidadosRepository extends JpaRepository<Convidado, Long>{

}

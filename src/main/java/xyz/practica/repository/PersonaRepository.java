package xyz.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.practica.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}

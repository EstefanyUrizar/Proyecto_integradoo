package com.example.Proyecto.Integrador.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InscripcionRepository<Inscripcion> extends JpaRepository<Inscripcion, Long> {
    <Inscripcion> List<Inscripcion> findByEstudianteId(Long estudianteId);
}
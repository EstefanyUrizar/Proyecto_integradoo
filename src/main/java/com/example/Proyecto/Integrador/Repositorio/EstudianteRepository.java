package com.example.Proyecto.Integrador.Repositorio;



import com.example.Proyecto.Integrador.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    // Puedes agregar métodos personalizados si es necesario
}


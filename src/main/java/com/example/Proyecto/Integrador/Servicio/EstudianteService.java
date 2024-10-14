package com.example.Proyecto.Integrador.Servicio;

import com.example.Proyecto.Integrador.model.Estudiante; // Cambia aquí
import java.util.List;

public interface EstudianteService {
    List<Estudiante> obtenerEstudiantes();
    Estudiante crearEstudiante(Estudiante estudiante);
    Estudiante actualizarEstudiante(Long id, Estudiante estudiante);
    void eliminarEstudiante(Long id);
}
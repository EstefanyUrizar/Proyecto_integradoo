package com.example.Proyecto.Integrador.Controlador;

import com.example.Proyecto.Integrador.model.Estudiante;
import com.example.Proyecto.Integrador.Servicio.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> obtenerTodos() {
        return estudianteService.obtenerEstudiantes();
    }

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.crearEstudiante(estudiante);
    }

    @PutMapping("/{id}")
    public Estudiante actualizarEstudiante(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        return estudianteService.actualizarEstudiante(id, estudiante);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstudiante(@PathVariable Long id) {
        estudianteService.eliminarEstudiante(id);
    }
}
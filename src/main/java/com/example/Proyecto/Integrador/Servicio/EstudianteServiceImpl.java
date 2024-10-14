package com.example.Proyecto.Integrador.Servicio;

import com.example.Proyecto.Integrador.model.Estudiante;
import com.example.Proyecto.Integrador.Repositorio.EstudianteRepository; // Asegúrate de tener este repositorio
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository; // Repositorio de Estudiante

    @Override
    public List<Estudiante> obtenerEstudiantes() {
        return estudianteRepository.findAll(); // Utiliza el repositorio para obtener todos los estudiantes
    }

    @Override
    public Estudiante crearEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante); // Guarda el estudiante en la base de datos
    }

    @Override
    public Estudiante actualizarEstudiante(Long id, Estudiante estudiante) {
        Optional<Estudiante> optionalEstudiante = estudianteRepository.findById(id); // Busca el estudiante por ID
        if (optionalEstudiante.isPresent()) {
            Estudiante e = optionalEstudiante.get();
            e.setNombre(estudiante.getNombre());
            e.setApellido(estudiante.getApellido());
            e.setEmail(estudiante.getEmail());
            return estudianteRepository.save(e); // Actualiza el estudiante en la base de datos
        }
        return null; // Si no se encuentra, retorna null
    }

    @Override
    public void eliminarEstudiante(Long id) {
        estudianteRepository.deleteById(id); // Elimina el estudiante por ID
    }
}

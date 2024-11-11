package com.example.evidencia_framework.demo.services;

import com.example.evidencia_framework.demo.dao.entities.ProfesorEntity;
import com.example.evidencia_framework.demo.dao.repositories.ProfesorRepository;
import com.example.evidencia_framework.demo.interfaces.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService implements IProfesorService {
    @Autowired
    private ProfesorRepository profesorRepository;

    //Metodo para obtener todos los profesores
    @Override
    public List<ProfesorEntity> obtenerProfesores() {
        //Se retorna la lista obtenida a partir del metodo heredado de JPA
        return profesorRepository.findAll();
    }

    //Metodo para crear un profesor
    @Override
    public String crearProfesor(ProfesorEntity profesorEntity) {
        //se invoca metodo heredado de JPA para almacenar o actualizar un profesor
        profesorRepository.save(profesorEntity);
        return "Se guardó el profesor con éxito!";
    }

    //Metodo para actualizar un profesor
    @Override
    public String actualizarProfesor(ProfesorEntity profesorEntity) {
        //se invoca metodo heredado de JPA para almacenar o actualizar un profesor
        profesorRepository.save(profesorEntity);
        return "Se actualizó el profesor con éxito!";
    }

    //Metodo para eliminar un profesor
    @Override
    public String eliminarProfesor(String documento) {
        //se invoca metodo heredado de JPA para eliminar un profesor
        profesorRepository.deleteById(documento);
        return "Se eliminó el profesor con éxito!";
    }
}

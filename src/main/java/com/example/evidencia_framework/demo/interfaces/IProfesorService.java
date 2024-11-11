package com.example.evidencia_framework.demo.interfaces;

import com.example.evidencia_framework.demo.dao.entities.ProfesorEntity;

import java.util.List;

public interface IProfesorService {
    public List<ProfesorEntity> obtenerProfesores();

    public String crearProfesor(ProfesorEntity profesorEntity);

    public String actualizarProfesor(ProfesorEntity profesorEntity);

    public String eliminarProfesor(String documento);
}

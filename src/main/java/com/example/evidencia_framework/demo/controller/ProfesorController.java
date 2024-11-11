package com.example.evidencia_framework.demo.controller;

import com.example.evidencia_framework.demo.dao.entities.ProfesorEntity;
import com.example.evidencia_framework.demo.interfaces.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/profesores")
@CrossOrigin("*") //se habilita el origen cruzado para permitir que este servicio sea consumido desde cualquier dominio
public class ProfesorController {
    @Autowired
    private IProfesorService iProfesorService;

    //Endpoint para obtener todos los profesores
    @CrossOrigin("*")
    @GetMapping("/obtener-profesores")
    public ResponseEntity <List<ProfesorEntity>> obtenerProfesores(){
        //Se invoca el metodo de la interfaz
        List<ProfesorEntity> listaProfesores = iProfesorService.obtenerProfesores();
        return ResponseEntity.ok().body(listaProfesores);
    }

    //Endpoint para crear profesor
    @CrossOrigin("*")
    @PostMapping
    public ResponseEntity<String> crearProfesor(@RequestBody ProfesorEntity profesorEntity){
        //Se invoca el metodo de la interfaz
        String mensaje = iProfesorService.crearProfesor(profesorEntity);
        return ResponseEntity.ok().body(mensaje);
    }

    //Endpoint para actualizar profesor
    @CrossOrigin("*")
    @PutMapping
    public ResponseEntity<String> actualizarProfesor(@RequestBody ProfesorEntity profesorEntity){
        //Se invoca el metodo de la interfaz
        String mensaje = iProfesorService.actualizarProfesor(profesorEntity);
        return ResponseEntity.ok().body(mensaje);
    }

    //Endpoint para eliminar profesor
    @PostMapping("/delete")
    @CrossOrigin("*")
    public ResponseEntity<String> eliminarProfesor(@RequestBody String documento){
        //Se invoca el metodo de la interfaz
        String mensaje = iProfesorService.eliminarProfesor(documento);
        return ResponseEntity.ok().body(mensaje);
    }

}

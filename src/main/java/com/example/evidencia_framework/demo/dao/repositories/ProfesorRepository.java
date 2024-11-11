package com.example.evidencia_framework.demo.dao.repositories;

import com.example.evidencia_framework.demo.dao.entities.ProfesorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<ProfesorEntity, String> {
}

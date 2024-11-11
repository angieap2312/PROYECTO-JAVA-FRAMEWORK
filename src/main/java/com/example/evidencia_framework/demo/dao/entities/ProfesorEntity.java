package com.example.evidencia_framework.demo.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "profesor")
public class ProfesorEntity {
    @Id
    private String docProf;
    private String nomProf;
    private String apeProf;
    private Integer cateProf;
    private Long salProf;
}

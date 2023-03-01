/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.mongo.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author matei
 */
@Getter
@Setter
@Document(collection = "Profesor")
@Data

public class Profesor {

    @Id
    private Long id_profesor;
    private String nombre;
    private String telefono;
    private String direccion;
    private Departamento departamento;
    private Curso listaCursos;

}

package com.proyecto.web.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class propiedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private long area;

    @Column(nullable = false)
    private Long propietarioId; // ID del propietario

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private double precio;

    @Column(nullable = false)
    private int numeroHabitaciones;

    @Column(nullable = false)
    private int numeroBanos;

    @Column(nullable = false)
    private boolean disponible;

    @Column(nullable = false)
    private String tipoPropiedad; 

    @Column
    private String descripcion; 
}

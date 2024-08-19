
package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Producto {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo_producto;
    private String nombre;
    private String marca;
    private double costo;
    private int cantidad_disponible;

    public Producto() {
        
        
    }

    public Producto(int codigo_producto, String nombre, String marca, double costo, int cantidad_disponible) {
        this.codigo_producto = codigo_producto;
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
        this.cantidad_disponible = cantidad_disponible;
    }
    
    
    
    
    
    
    
}

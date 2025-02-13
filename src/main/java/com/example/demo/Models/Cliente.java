
package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter @Setter
public class Cliente {
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_cliente;
    private String nombre;
    private String apellido;
    private String dni;

    public Cliente() {
        
    }

    public Cliente(int id_cliente, String nombre, String apellido, String dni) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    
    
    
    
    
    
}

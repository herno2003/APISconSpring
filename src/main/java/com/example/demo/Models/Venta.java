
package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.Getter;

import lombok.Setter;

@Entity
@Getter @Setter
public class Venta {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int codigo_venta;
    private String Fecha_venta;
    private double total;
    
    @OneToMany
    private List<Producto>listaProductos;
    
    @OneToOne
    @JoinColumn(name="un_cliente_id_cliente" , referencedColumnName = "id_cliente")
    private Cliente unCliente;

    public Venta() {
        
    }

    public Venta(int codigo_venta, String Fecha_venta, double total, List<Producto> listaProductos, Cliente unCliente) {
        this.codigo_venta = codigo_venta;
        this.Fecha_venta = Fecha_venta;
        this.total = total;
        this.listaProductos = listaProductos;
        this.unCliente = unCliente;
    }
    
    
    
    
    
}

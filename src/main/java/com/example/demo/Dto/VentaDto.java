
package com.example.demo.Dto;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class VentaDto {
    
    private int codigo_venta;
    private double total;
    private int cantProductos;
    private String nombreCliente;
    private String apellidoCliente;

    public VentaDto() {
        
    }

    public VentaDto(int codigo_venta, double total, int cantProductos, String nombreCliente, String apellidoCliente) {
        this.codigo_venta = codigo_venta;
        this.total = total;
        this.cantProductos = cantProductos;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
    }
    
    
    
    
    
    
    
}

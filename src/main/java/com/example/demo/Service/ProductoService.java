
package com.example.demo.Service;

import com.example.demo.Models.Producto;
import com.example.demo.Repository.IProductoRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter @Setter
public class ProductoService implements IProductoService{
    
     private static final int MINIMA_CANTIDAD = 5;
    @Autowired
    private IProductoRepository productoRepo;

    @Override
    public void saveProducto(Producto producto) {
        
        productoRepo.save(producto);
    }

    @Override
    public List<Producto> getProductos() {
        
        return productoRepo.findAll();
    }

    @Override
    public void deleteProducto(int id) {
        
        productoRepo.deleteById(id);
    }

    @Override
    public Producto findProducto(int id) {
        
        return productoRepo.findById(id).orElse(null);
    }

    @Override
    public void editProducto(Producto producto) {
        
        this.productoRepo.save(producto);
    }

    @Override
    public List<Producto> faltaStock() {
        
        List<Producto>listaDeProductos= this.getProductos();
        List<Producto>faltaStock= new ArrayList<>();
        
        for (Producto productoAux : listaDeProductos) {
            
            if (productoAux.getCantidad_disponible()<MINIMA_CANTIDAD) {
                
                faltaStock.add(productoAux);
                
            }
            
        }
        
        return faltaStock;
    }
   

   
    
    
    
    
}


package com.example.demo.Controller;

import com.example.demo.Models.Producto;
import com.example.demo.Service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductoController {
    
    @Autowired
    private IProductoService productoServ;
    
    
    @PostMapping("/producto/crear")
    public String saveProducto( @RequestBody Producto producto) {
        
        productoServ.saveProducto(producto);
        
        return "Producto creado exitosamente";
        
    }
    
    @PutMapping("/producto/editar")
    public String editarProducto ( @RequestBody Producto  producto){
        
        productoServ.editProducto(producto);
         
         return "Producto  editado correctamente";
        
        
        
    }
    
    @DeleteMapping("/producto/borrar")
    public String borrarMascota(@RequestParam int id){
        
        productoServ.deleteProducto(id);
        
        
        return "Producto eliminado.";
        
    }
    
    @GetMapping("/producto/traerlista")
    public List<Producto>traerProductos(){
        
        return productoServ.getProductos();
    }
    
    @GetMapping("/producto/traer")
    public Producto traerProducto (@RequestParam int id){
        
        return productoServ.findProducto(id);
        
    }
    
    @GetMapping("/productos/falta_stock")
    public List<Producto>faltaProductos(){
        
        return productoServ.faltaStock();
    }
    
    
    
}

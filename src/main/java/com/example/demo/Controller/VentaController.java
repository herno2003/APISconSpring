 
package com.example.demo.Controller;

import com.example.demo.Dto.VentaDto;
import com.example.demo.Models.Producto;
import com.example.demo.Models.Venta;
import com.example.demo.Service.IVentaService;
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
public class VentaController {
    
    @Autowired
    private IVentaService ventaServ;
    
    @PostMapping("/venta/crear")
    public String saveVenta( @RequestBody Venta venta) {
        
        ventaServ.saveVenta(venta);
        
        return "Venta creada exitosamente";
        
    }
    
    @PutMapping("/venta/editar")
    public String editarVenta ( @RequestBody Venta  venta){
        
        ventaServ.editVenta(venta);
         
         return "Producto  editado correctamente";
        
        
        
    }
    
    @DeleteMapping("/venta/borrar")
    public String borrarVenta(@RequestParam int id){
        
        ventaServ.deleteVenta(id);
        
        
        return "Venta eliminada.";
        
    }
    
    @GetMapping("/venta/traerlista")
    public List<Venta>traerVentas(){
        
        return ventaServ.getVentas();
    }
    
    @GetMapping("/venta/traer")
    public Venta traerVenta (@RequestParam int id){
        
        return ventaServ.findVenta(id);
        
    }
    
    @GetMapping("ventas/productos")
    public List<Producto>ventaProductos(@RequestParam int codigo_venta){
        
        
        return ventaServ.getListaProductoVenta(codigo_venta);
    }
    
    @GetMapping("ventas/fecha_venta")
    public double getMonto(@RequestParam String fecha_venta){
        
        return ventaServ.getMontoYCantTotal(fecha_venta);
        
    }
    
    @GetMapping("ventas/mayor_venta")
    public VentaDto ventaMayor(){
        
       return  ventaServ.getVentaMontoMayor();
        
    }
    
    
}

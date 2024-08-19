
package com.example.demo.Service;

import com.example.demo.Dto.VentaDto;
import com.example.demo.Models.Producto;
import com.example.demo.Models.Venta;
import com.example.demo.Repository.IVentaRepository;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter @Setter

public class VentaService implements IVentaService {

    @Autowired
    private IVentaRepository ventaRepo;
    
    @Override
    public void saveVenta(Venta venta) {
        
        ventaRepo.save(venta);
        
    }

    @Override
    public List<Venta> getVentas() {
        
        return ventaRepo.findAll();
        
    }

    @Override
    public void deleteVenta(int id) {
        
        ventaRepo.deleteById(id);
        
    }

    @Override
    public Venta findVenta(int id) {
        
        return ventaRepo.findById(id).orElse(null);
        
        
    }

    @Override
    public void editVenta(Venta venta) {
        
        this.ventaRepo.save(venta);
        
    }

    @Override
    public double getMontoYCantTotal(String fechaVenta) {
        // ENTENDER BIEN
        
        
        List<Venta>listaVentas= this.getVentas();
        
        double sumaMonto=0;
        
        // RECORREMOS LA LISTA, COMPARAMOS LA FECHA CON LA Q RECIBIMOS POR PARAMETRO
        //Y LUEGO OBTENEMOS EL MONTO TOTAL DE ESE DIA.
        for (Venta ventaAux : listaVentas) {
            
            if (ventaAux.getFecha_venta().equals(fechaVenta)) {
                
                sumaMonto+=ventaAux.getTotal();
            }
           
            
        
        
    }
        
        return sumaMonto;
    }
        
        

    @Override
    public VentaDto getVentaMontoMayor() {
     
        // Fijarse que el el mayor sea del mismo tipo de variable que el atributo a obtener.
        double mayor=0 ;
        List<Venta>ventas= this.getVentas();
        VentaDto ventaDto = new VentaDto();
        
        
        
        
        for (Venta ventaAux : ventas) {
            
            if (ventaAux.getTotal()> mayor) {
                
                mayor= ventaAux.getTotal();
                
                ventaDto.setCodigo_venta(ventaAux.getCodigo_venta());
                ventaDto.setTotal(ventaAux.getTotal());
                ventaDto.setCantProductos(ventaAux.getListaProductos().size());
                ventaDto.setNombreCliente(ventaAux.getUnCliente().getNombre());
                ventaDto.setApellidoCliente(ventaAux.getUnCliente().getApellido());
                
                
            }
            
            
           
        }
        
        
     return ventaDto;
    
    }

    @Override
    public List<Producto> getListaProductoVenta(int codigo_venta) {
        
        Venta venta = this.findVenta(codigo_venta);
        
        return venta.getListaProductos();
        
    }

    

    

    
}
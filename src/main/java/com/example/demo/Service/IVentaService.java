
package com.example.demo.Service;

import com.example.demo.Dto.VentaDto;
import com.example.demo.Models.Producto;
import com.example.demo.Models.Venta;
import java.util.List;


public interface IVentaService {
    
    public void saveVenta(Venta venta);

    public List<Venta> getVentas();

    public void deleteVenta(int id);

    public Venta findVenta(int id);

    public void editVenta(Venta venta);
    
    public double getMontoYCantTotal(String fechaVenta);
    
    public VentaDto getVentaMontoMayor();
    
    public List<Producto> getListaProductoVenta(int codigo_venta);
}

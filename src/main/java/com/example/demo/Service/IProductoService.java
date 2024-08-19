package com.example.demo.Service;

import com.example.demo.Models.Producto;
import java.util.List;

public interface IProductoService {

    public void saveProducto(Producto producto);

    public List<Producto> getProductos();

    public void deleteProducto(int id);

    public Producto findProducto(int id);

    public void editProducto(Producto producto);
    
    public List<Producto>faltaStock();

}

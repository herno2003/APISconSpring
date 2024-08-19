
package com.example.demo.Service;

import com.example.demo.Models.Cliente;
import java.util.List;



public interface IClienteService {
    
    public void saveCliente(Cliente cliente);

    public List<Cliente> getClientes();

    public void deleteCliente(int id);

    public Cliente findCliente(int id);

    public void editCliente(Cliente cliente);
    
}

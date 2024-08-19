
package com.example.demo.Service;

import com.example.demo.Models.Cliente;
import com.example.demo.Repository.IClienteRepository;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter @Setter
public class ClienteService implements IClienteService {
    
    @Autowired
    private IClienteRepository clienteRepo;

    @Override
    public void saveCliente(Cliente cliente) {
        
        clienteRepo.save(cliente);
    }

    @Override
    public List<Cliente> getClientes() {
        
       return clienteRepo.findAll();
    }

    @Override
    public void deleteCliente(int id) {
        
        clienteRepo.deleteById(id);
    }

    @Override
    public Cliente findCliente(int id) {
        
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public void editCliente(Cliente cliente) {
        
        this.clienteRepo.save(cliente);
    }
    
    
    
}

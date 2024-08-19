
package com.example.demo.Controller;

import com.example.demo.Models.Cliente;
import com.example.demo.Service.IClienteService;
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
public class ClienteController {
    
    @Autowired
    private IClienteService clienteServ;
    
    @PostMapping("/cliente/crear")
    public String saveCliente( @RequestBody Cliente cliente){
        
        clienteServ.saveCliente(cliente);
        
        return "Cliente creado exitosamente";
        
    }
    
    @PutMapping("/cliente/editar")
    public String editarCliente ( @RequestBody Cliente  cliente){
        
         clienteServ.editCliente(cliente);
         
         return "Cliente editado correctamente";
        
        
        
    }
    
    @DeleteMapping("/cliente/borrar")
    public String borrarMascota(@RequestParam int id){
        
        clienteServ.deleteCliente(id);
        
        
        return "Cliente eliminado.";
        
    }
    
    @GetMapping("/clientes/traerlista")
    public List<Cliente>traerClientes(){
        
        return clienteServ.getClientes();
    }
    
    @GetMapping("/cliente/traer")
    public Cliente traerCliente(@RequestParam int id){
        
        return clienteServ.findCliente(id);
        
    }
    
   
    
   
    
}

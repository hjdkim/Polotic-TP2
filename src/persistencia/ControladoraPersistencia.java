package persistencia;

import logica.Cliente;

public class ControladoraPersistencia {
    
    ClienteJpaController clienteJpa = new ClienteJpaController();
    
    public void crearCliente (Cliente cli) {
            clienteJpa.create(cli);
    }
    
}

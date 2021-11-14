package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crear(Cliente cli){
        controlPersis.crearCliente(cli);
    }
    
}

package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearCliente(Cliente cli) {
        controlPersis.crearCliente(cli);
    }
    
    //Método CREATE usado en la IGU. Recibe todos los datos menos el ID
    public void crearCliente(String num_cliente, String nombre_perro, String raza, String color, Boolean alergico, Boolean atencion_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        Cliente cli = new Cliente();
        cli.setNum_cliente(num_cliente);
        cli.setNombre_perro(nombre_perro);
        cli.setRaza(raza);
        cli.setColor(color);
        cli.setAlergico(alergico);
        cli.setAtencion_especial(atencion_especial);
        cli.setNombre_duenio(nombre_duenio);
        cli.setCelular_duenio(celular_duenio);
        cli.setObservaciones(observaciones);
        
        controlPersis.crearCliente(cli);
    }

}

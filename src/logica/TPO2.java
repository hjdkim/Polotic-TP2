package logica;

import igu.PantallaPrincipal;

public class TPO2 {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        PantallaPrincipal panta = new PantallaPrincipal(control);
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
        
        
        /*Cliente prueba
        Cliente cliente1 = new Cliente(0, "1", "Toby", "Yorkshire terrier", "Negro", Boolean.FALSE, Boolean.TRUE, "Daniel", "1134330220", "Sin observaciones");
        */
        
        /*Create prueba
        control.crearCliente(cliente1);
        */
    }
    
}

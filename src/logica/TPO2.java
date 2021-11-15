package logica;

import igu.PantallaPrincipal;

public class TPO2 {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        PantallaPrincipal panta = new PantallaPrincipal(control);
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);

    }
    
}

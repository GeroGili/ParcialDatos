package Ejer_3;

import javax.swing.JOptionPane;

public class prestamo {
	
	    private String[] titulos;
	    private boolean[] disponibles;
	    
	    public prestamo() {
	        titulos = new String[]{
	            "libro1",
	            "libro2"
	        };
	        disponibles = new boolean[]{true, true}; 
	    }
	    public void consultarEstado() {
	        String mensaje = "Estado de los Libros:\n";
	        for (int i = 0; i < titulos.length; i++) {
	            String estado = disponibles[i] ? "disponible" : "no disponible";
	            mensaje += titulos[i] + " - " + estado + "\n"; 
	            JOptionPane.showMessageDialog(null, mensaje);
	        }
	      
	    }


}

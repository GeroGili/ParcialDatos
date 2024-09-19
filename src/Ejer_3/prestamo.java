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
	    public void prestarLibro() {
	        String titulo = JOptionPane.showInputDialog("Ingresa el título del libro a prestar:");
	        for (int i = 0; i < titulos.length; i++) {
	            if (titulos[i].equalsIgnoreCase(titulo)) {
	                if (disponibles[i]) {
	                    disponibles[i] = false;
	                    JOptionPane.showMessageDialog(null, titulo + " Disfrutelo");
	                } else {
	                    JOptionPane.showMessageDialog(null, titulo + " Ya fue prestado");
	                }
	                
	            }
	        }
	        
	    }
	    public void devolverLibro() {
	        String titulo = JOptionPane.showInputDialog("Ingresa el título del libro que vas a devolver:");
	        for (int i = 0; i < titulos.length; i++) {
	            if (titulos[i].equalsIgnoreCase(titulo)) {
	                if (!disponibles[i]) {
	                    disponibles[i] = true;
	                    JOptionPane.showMessageDialog(null, titulo + "Se devolvio correctamente");
	                } else {
	                    JOptionPane.showMessageDialog(null, titulo + " ya esta en la biblioteca.");
	                }
	                
	            }
	        }
	      
	    }



}

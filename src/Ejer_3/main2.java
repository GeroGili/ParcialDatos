package Ejer_3;

import javax.swing.JOptionPane;

public class main2 {

	public static void main(String[] args) {
		prestamo prestamo = new prestamo();
        int opcion;
        String[] opciones = {"Mire el estado","Prestacion de libro","Devolver libro", "salir"};
        do {
        	
			opcion = JOptionPane.showOptionDialog(null,  
				"Bienvenido a Lectores Felices",
				"",
				0, 
				0, 
				null, 
				opciones, 
				opciones[1] );	          	      
            switch (opcion) {
                case 0:
                	prestamo.consultarEstado();
                    break;
                case 1:
                	prestamo.prestarLibro();
                    break;
                case 2:
                	prestamo.devolverLibro();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Que tenga un buen dia");
                    break;
               
            }
        } while (opcion != 3);
		
		

	}

}

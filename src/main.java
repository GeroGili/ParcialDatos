import javax.swing.JOptionPane;



public class main {

	public static void main(String[] args) {
		  consulta consulta = new consulta();
	        int opcion;
	        String[] opciones = {"Registre su consulta","vea su informacion","salir"	};

	        do {
	        	opcion = JOptionPane.showOptionDialog(null,//object  
						" Bienvenido a la veterinaria Amigos Peludos",
						"",
						0, 
						0, 
						null, //
						opciones, 
						opciones[1] );

	            switch (opcion) {
	                case 0:
	                    consulta.registroConsulta();
	                    break;
	                case 1:
	                   
	                    break;
	                case 2:
	                    JOptionPane.showMessageDialog(null, "Hasta la proxima visita.");
	                    break;
	               
	            }
	        } while (opcion != 2);
		
		
	

	}

}

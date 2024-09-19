import java.time.LocalDate;

import javax.swing.JOptionPane;

public class consulta {

	private LocalDate fecha;
	private String hora;
	private String Paciente;
	private String Veterinario;
	private int estadoCorazon;
	private int estadoEstomago;
	private int estadoPatas;

	// Getters y Setters
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getNombrePaciente() {
		return Paciente;
	}

	public void setNombrePaciente(String Paciente) {
		this.Paciente = Paciente;
	}

	public String getNombreVeterinario() {
		return Veterinario;
	}

	public void setNombreVeterinario(String Veterinario) {
		this.Veterinario = Veterinario;
	}

	public int getEstadoCorazon() {
		return estadoCorazon;
	}

	public void setEstadoCorazon(int estadoCorazon) {
		this.estadoCorazon = estadoCorazon;
	}

	public int getEstadoEstomago() {
		return estadoEstomago;
	}

	public void setEstadoEstomago(int estadoEstomago) {
		this.estadoEstomago = estadoEstomago;
	}

	public int getEstadoPatas() {
		return estadoPatas;
	}

	public void setEstadoPatas(int estadoPatas) {
		this.estadoPatas = estadoPatas;
	}

	public void registroConsulta() {
		int año;
		do {
			año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la consulta (YYYY):"));
			if (año < 2000) {
				JOptionPane.showMessageDialog(null, "el año no puede ser menor a 2000");

			} else if (año > 2024) {
				JOptionPane.showMessageDialog(null, "El año no puede ser mayor al actual");

			}
			{

			}

		} while (año <2000 || año > 2024);
		int mes;
		do {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la consulta (1-12):"));
			if (mes > 12) {
				JOptionPane.showMessageDialog(null, "El mes no puede ser mayor que 12");

			} else if (mes < 1) {
				JOptionPane.showMessageDialog(null, "El mes no puede ser menor a 1");

			}

		} while (mes < 1 || mes > 12);
		int dia;
		do {
			dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de la consulta (1-31):"));
			if (dia>31) {
				JOptionPane.showMessageDialog(null, "El dia no puede ser mayor que 31");

			} else if (mes <= 0) {
				JOptionPane.showMessageDialog(null, "El dia no puede ser negativo");

			}

		} while (dia <= 0 || dia > 32);

		fecha = LocalDate.of(año, mes, dia);
		do {
			hora = JOptionPane.showInputDialog("Ingrese la hora de la consulta:");
			if (hora.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El horario no puede estar vacio");
				
			}
			
		} while (hora.isEmpty());
		do {
			Paciente = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
			if (Paciente.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El nombre del Paciente no puede estar vacio");				
			}
			
		} while (Paciente.isEmpty());
		do {
			Veterinario = JOptionPane.showInputDialog("Ingrese el nombre del veterinario:");
			if (Veterinario.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El Nombre del Veterinario no puede estar vacio");
				
			}
			
		} while (Veterinario.isEmpty());

		int elegir = 0;
		String[] elecciones = { "si", "no" };
		do {
			
			estadoCorazon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado del corazón del paciente (0-10):"));
			if (estadoCorazon < 7) {
				elegir = JOptionPane.showOptionDialog(null,
						"Detectamos que el corazon del " + Paciente
						+ " puede llegar a tener problemas, ¿le realizamos un ecocardiograma?",
						"que hacemos", 0, 0, null, //
						elecciones, elecciones[1]);
				switch (elegir) {
				case 0:
					JOptionPane.showMessageDialog(null,
							"Se ha realizado el estudio y logramos resolver el problema su corazon ya funciona al 100%");
					estadoCorazon = 100;
					
					break;
				case 1:
					JOptionPane.showMessageDialog(null,
							"Respetamos su decicion esperemos no traiga problemas en el futuro");
					
					break;
					
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "El corazon del paciente funciona con normalidad");
				
			}
		} while (estadoCorazon<=0 || estadoCorazon>10);
		do {
			estadoEstomago = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado del estómago del paciente (0-10):"));
			if (estadoEstomago < 6) {
				elegir = JOptionPane.showOptionDialog(null,
						"Detectamos que el estomago del " + Paciente
						+ " puede llegar a tener problemas, ¿le realizamos una eco abdominal?",
						"que hacemos", 0, 0, null, //
						elecciones, elecciones[1]);
				switch (elegir) {
				case 0:
					JOptionPane.showMessageDialog(null,
							"Se ha realizado el estudio y logramos resolver el problema su estomago ya funciona al 100%");
					estadoEstomago = 100;
					
					break;
				case 1:
					JOptionPane.showMessageDialog(null,
							"Respetamos su decicion esperemos no traiga problemas en el futuro");
					
					break;
					
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "El estomago del paciente funciona con normalidad");
				
			}
			
		} while (estadoEstomago<=0 || estadoEstomago>10);
		
		do {
			
			estadoPatas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado de las patas del paciente (0-10):"));
			if (estadoPatas < 6) {
				elegir = JOptionPane.showOptionDialog(null,
						"Detectamos que las patas del " + Paciente
						+ " puede llegar a tener problemas, ¿le realizamos una ravision?",
						"que hacemos", 0, 0, null, //
						elecciones, elecciones[1]);
				switch (elegir) {
				case 0:
					JOptionPane.showMessageDialog(null,
							"Se ha realizado la revision y logramos resolver el problema sus patas ya funciona al 100%");
					estadoPatas = 100;
					
					break;
				case 1:
					JOptionPane.showMessageDialog(null,
							"Respetamos su decicion esperemos no traiga problemas en el futuro");
					
					break;
					
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "las patas del paciente funciona con normalidad");
				
			}
		} while (estadoPatas<=0 || estadoPatas>10);

	}

	public void mostrar() {
		String mensaje = ("Turno Registrado:\nFecha: " + fecha + "\nHora: " + hora + "\nPaciente: " + Paciente
				+ "\nVeterinario: " + Veterinario + "\nEstado del Corazón: " + estadoCorazon + "\nEstado del Estómago: "
				+ estadoEstomago + "\nEstado de las Patas: " + estadoPatas);
		JOptionPane.showMessageDialog(null, mensaje);

	}

}

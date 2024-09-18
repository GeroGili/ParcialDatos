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
		int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la consulta (YYYY):"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la consulta (1-12):"));
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de la consulta (1-31):"));

		fecha = LocalDate.of(año, mes, dia);

		hora = JOptionPane.showInputDialog("Ingrese la hora de la consulta:");
		Paciente = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
		Veterinario = JOptionPane.showInputDialog("Ingrese el nombre del veterinario:");

		int elegir = 0;
		String[] elecciones = { "si", "no" };

		estadoCorazon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado del corazón del paciente:"));
		if (estadoCorazon < 70) {
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
		estadoEstomago = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado del estómago del paciente:"));
		if (estadoEstomago < 60) {
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

		estadoPatas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado de las patas del paciente:"));
		if (estadoPatas < 60) {
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
			JOptionPane.showMessageDialog(null, "las estom del paciente funciona con normalidad");

		}
	

		
	}
}

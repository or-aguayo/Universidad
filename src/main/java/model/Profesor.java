package model;

public class Profesor extends Trabajador {

	public String getTipo() {
		return "Profesor";
	}

	public Profesor(String nombre, String direccion, String rut, String estadoCivil, String tituloProfesional) {
		super(nombre,direccion,rut,estadoCivil,tituloProfesional);
	}

	public void asignarHorario(int opcion) {
		switch (opcion){
			case 1:
				super.setHorario("Jornada parcial");
				break;
			case 2:
				super.setHorario("Media Jornada");
				break;
			case 3:
				super.setHorario("Jornada completa");
				break;
		}
	}
}
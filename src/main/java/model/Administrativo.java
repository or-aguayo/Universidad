package model;

public class Administrativo extends Trabajador {
	private Departamento departamento;

	public String getTipo() {
		return "Administrativo";
	}

	public Administrativo(String nombre, String direccion, String rut, String estadoCivil, String tituloProfesional, String horario	) {
		super(nombre,direccion,rut,estadoCivil,tituloProfesional,horario);
	}
	public Departamento asociarDepartamento(Departamento departamento){
		this.departamento = departamento;
		return departamento;
	}
}
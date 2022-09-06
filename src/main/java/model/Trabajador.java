package model;

public abstract class Trabajador {
	private String nombre;
	private String direccion;
	private String rut;
	private String horario;
	private String estadoCivil;
	private String tituloProfesional;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public abstract String getTipo();

	public Trabajador(String nombre, String direccion, String rut, String estadoCivil, String tituloProfesional, String horario) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.rut = rut;
		this.estadoCivil = estadoCivil;
		this.tituloProfesional =tituloProfesional;
		this.horario=horario;
	}

	public Trabajador(String nombre, String direccion, String rut, String estadoCivil, String tituloProfesional) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.rut = rut;
		this.estadoCivil = estadoCivil;
		this.tituloProfesional =tituloProfesional;
	}
}
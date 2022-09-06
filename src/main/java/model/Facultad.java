package model;

import java.util.ArrayList;
import model.Departamento;

public class Facultad {
	private String nombre;
	private String latitud;
	private String longitud;
	private Universidad universidad;
	private ArrayList<Departamento> departamentos;

	public Facultad(String nombre, String latitud, String longitud,Universidad universidad) {
		this.departamentos= new ArrayList<Departamento>();
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.universidad = universidad;
	}

	public Departamento agregarDepartamento(Departamento departamento) {
		this.departamentos.add(departamento);
		return departamento;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}
}
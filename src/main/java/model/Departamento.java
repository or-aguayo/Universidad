package model;

import java.util.ArrayList;
import model.CarreraUniversitaria;
import model.Profesor;
import model.Administrativo;

public class Departamento {
	private String nombre;
	private Facultad facultad;
	private ArrayList<CarreraUniversitaria> carrerasUniversitarias;
	private ArrayList<Profesor> profesores;
	private ArrayList<Administrativo> administrativos;

	public Departamento(String nombre, Facultad facultad) {
		this.nombre= nombre;
		this.facultad = facultad;
		this.carrerasUniversitarias= new ArrayList<CarreraUniversitaria>();
		this.profesores= new ArrayList<Profesor>();
		this.administrativos= new ArrayList<Administrativo>();

	}

	public CarreraUniversitaria agregarCarrera(CarreraUniversitaria carrera) {
		this.carrerasUniversitarias.add(carrera);
		return carrera;
	}

	public Profesor asociarProfesor(Profesor profesor) {
		this.profesores.add(profesor);
		return profesor;
	}

	public Administrativo asociarAdministrativo(Administrativo administrativo) {
		this.administrativos.add(administrativo);
		return administrativo;
	}

	public ArrayList<CarreraUniversitaria> getCarrerasUniversitarias() {
		return carrerasUniversitarias;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public ArrayList<Administrativo> getAdministrativos() {
		return administrativos;
	}
}
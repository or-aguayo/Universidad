package model;

import java.util.ArrayList;
import java.util.List;

import model.Facultad;
import model.Trabajador;

public class Universidad {
	private String nombre;
	private String[] direccionesAsociadas;
	private String tipoUniversidad;
	private ArrayList<Facultad> facultades = new ArrayList<Facultad>();
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

	public String[] getDireccionesAsociadas() {
		return this.direccionesAsociadas;
	}

	public void setDireccionesAsociadas(String[] direccionesAsociadas) {
		this.direccionesAsociadas = direccionesAsociadas;
	}

	public String getTipoUniversidad() {
		return this.tipoUniversidad;
	}

	public void setTipoUniversidad(String tipoUniversidad) {
		this.tipoUniversidad = tipoUniversidad;
	}

	public Facultad agregarFacultad(Facultad facultad) {
		this.facultades.add(facultad);
		return facultad;
	}

	public Profesor agregarProfesor(Profesor profesor) {
		this.trabajadores.add(profesor);
		return profesor;
	}

	public Administrativo agregarAdministrativo(Administrativo administrativo) {
		this.trabajadores.add(administrativo);
		return administrativo;
	}

	public List<Profesor> obtenerProfesoresFacultad(Facultad facultad) {
		List<Profesor> profesores= new ArrayList<Profesor>();
			for(Departamento departamento : facultad.getDepartamentos()){
					profesores.addAll(departamento.getProfesores());
			}
			return profesores;
	}



	public List<CarreraUniversitaria> obtenerCarrerasFacultad(Facultad facultad) {
		List<CarreraUniversitaria> carrerasUniversitaria = new ArrayList<CarreraUniversitaria>();
		for(Departamento departamento : facultad.getDepartamentos()) {
			carrerasUniversitaria.addAll(departamento.getCarrerasUniversitarias());
		}
		return carrerasUniversitaria;
	}

	public List<Profesor> obtenerProfesoresPorContrato(String contrato, Departamento departamento) {
		List<Profesor> profesores = new ArrayList<Profesor>();
		for(Profesor profesorDepartamento : departamento.getProfesores()){
			if(profesorDepartamento.getHorario().equals(contrato)){
				profesores.add(profesorDepartamento);
			}
		}
		return profesores;

	}

	public List<Profesor> obtenerProfesores() {
		List<Profesor> profesores = new ArrayList<Profesor>();
		for(Trabajador trabajador : this.trabajadores){
			if(trabajador.getTipo().equals("Profesor")){
				profesores.add((Profesor) trabajador);
			}
		}
		return profesores;
	}
    public List<Profesor> obtenerProfesoresViajeLargo(){
		List<Profesor> profesores = new ArrayList<Profesor>();
		for(Facultad facultad : this.facultades){
			for(Departamento departamento : facultad.getDepartamentos()){
				profesores.addAll(departamento.getProfesores());
			}
		}
		return profesores;
	}
	public List<Administrativo> obtenerAdministrativos() {
		List<Administrativo> administrativos = new ArrayList<Administrativo>();
		for(Trabajador trabajador : this.trabajadores){
			if(trabajador.getTipo().equals("Administrativo")){
				administrativos.add((Administrativo) trabajador);
			}
		}
		return administrativos;
	}
}
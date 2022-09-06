package controller;

import model.Departamento;
import model.Facultad;
import model.Profesor;
import model.Universidad;

public class UniversidadController {
    public static void inicializar(){
        Universidad universidad = new Universidad();
        Facultad facultad = new Facultad("FICA","x","y",universidad);
        universidad.agregarFacultad(facultad);
        Departamento departamento = new Departamento("DCI", facultad);
        facultad.agregarDepartamento(departamento);
        Profesor profesor= new Profesor("Oscar Aguayo", "direccion","rut","estado","Ing civil informatico");
        universidad.agregarProfesor(profesor);
        departamento.asociarProfesor(profesor);
        System.out.println(universidad.obtenerProfesoresFacultad(facultad).get(0).getNombre());
        System.out.println(universidad.obtenerProfesoresViajeLargo().get(0).getNombre());
        System.out.println(universidad.obtenerProfesores().get(0).getNombre());


    }

    public static void main(String[] args) {
        inicializar();
    }
}

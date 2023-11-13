package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private int id;
    private String nombre;
    private String legajo;

    private List<Materia> materiasAprobadas;

    public Alumno() {
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public Alumno(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void agregarMateriaAprobada(Materia materia){
        this.materiasAprobadas.add(materia);

    }

    public boolean tieneCorrelativa(Materia materiaCorrelativa){

        return this.materiasAprobadas.contains(materiaCorrelativa);

    }

    @Override
    public String toString() {
        return this.nombre;
    }
}

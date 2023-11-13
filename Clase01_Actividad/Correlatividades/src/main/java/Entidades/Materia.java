package Entidades;

import java.util.ArrayList;

public class Materia {
    private int id;
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativa(Materia correlativa){
        this.correlativas.add(correlativa);

    }

    public boolean puedeCursar(Alumno alumno){
        // el alumno puede cursar si tiene todas las correlativas

       return this.correlativas.stream()
               .allMatch(materiaCorrelativa->alumno.tieneCorrelativa());

    }

    @Override
    public String toString() {
        return this.nombre;
    }
}

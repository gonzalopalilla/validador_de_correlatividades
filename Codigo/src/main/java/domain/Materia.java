package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Materia {

    private int id_materia;


    private String nombre_materia;


    private String descripcion;


    private final List<Materia> correlativas = new ArrayList<>();

    public int getId_materia() {
        return id_materia;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarCorrelativas(Materia...materias){
        Collections.addAll(this.correlativas,materias);
    }

    public boolean materia_cumple_correlativas(ArrayList <Materia> materias){
        return this.getCorrelativas().containsAll(materias);
    }

    public void quitarCorrelativas(Materia...materias){
        this.correlativas.removeAll(List.of(materias));
    }



    public Materia(int numero,String nombre,String descripcion,Materia...materias){
        this.id_materia = numero;
        this.nombre_materia = nombre;
        this.descripcion = descripcion;
        agregarCorrelativas(materias);
    }



}

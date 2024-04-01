package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {

    private int id_alumno;

    private String nombre;


    public ArrayList<Materia> getMaterias_aprobadas() {
        return materias_aprobadas;
    }

    private final ArrayList <Materia> materias_aprobadas = new ArrayList<>();


    public int getId_alumno() {
        return id_alumno;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void agregarMateriasAprobadas(Materia... materias){
        Collections.addAll(this.materias_aprobadas,materias);
    }

    public Alumno(int numero,String nombre,Materia...materias){
        this.id_alumno = numero;
        this.nombre = nombre;
        agregarMateriasAprobadas(materias);
    }




}





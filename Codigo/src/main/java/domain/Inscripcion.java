package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Inscripcion {

    private int id_inscripcion;


    private Alumno alumno;


    private final List<Materia> materias_a_inscribirse = new ArrayList<>();

    private LocalDate fecha_inscripcion;

    private boolean estado_inscripcion;

    public int getId_inscripcion() {
        return id_inscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Materia> getMaterias_a_inscribirse() {
        return materias_a_inscribirse;
    }

    public void agregarMateriasAInscribirse(Materia...materias){
        Collections.addAll(this.materias_a_inscribirse,materias);
    }

    public void quitarMateriasDeInscripcion(Materia...materias){
        this.materias_a_inscribirse.removeAll(List.of(materias));
    }

    public Inscripcion(int numero, Alumno alumno, Materia... materias){
        this.id_inscripcion = numero;
        this.alumno = alumno;
        agregarMateriasAInscribirse(materias);
        this.fecha_inscripcion = LocalDate.now();

    }

    public boolean aprobada(){
        return !this.materias_a_inscribirse.stream().map(materia -> materia.materia_cumple_correlativas(alumno.getMaterias_aprobadas())).toList().contains(false);
    }





}

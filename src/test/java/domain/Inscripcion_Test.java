package domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

public class Inscripcion_Test {

    Materia discreta = new Materia(1,"Matematica Discreta",null, (Materia) null);
    Materia algoritmos = new Materia(2,"Algortimos y Estructura de Datos",null, (Materia) null);
    Materia dds = new Materia(3,"Disenio de Sistemas",null,algoritmos,discreta);

    Materia arquitectura_de_computadores = new Materia(4,"Arquitectura de Computadores",null, (Materia) null);

    Materia sistemas_operativos = new Materia(5,"Sistemas Operativos",null,arquitectura_de_computadores);


    Alumno pedro = new Alumno(1,"Pedro Perez",discreta,algoritmos);


    @Test
    @DisplayName("Pedro debe tener la inscripcion aprobada ya que solo quiere inscribirse en DDS y tiene AEDS y Discreta aprobada")
    public void inscripcion_debe_aprobarse(){

        Inscripcion nueva_inscripcion = new Inscripcion(1,pedro,dds);

        Assert.assertTrue(nueva_inscripcion.aprobada());
    }

    @Test
    @DisplayName("Pedro no puede inscribirse a Sistemas Operativos ya que debe Arquitectura de Computadores")
    public void inscripcion_debe_rechazarse(){
        Inscripcion nueva_inscripcion = new Inscripcion(1,pedro,dds,sistemas_operativos);
        Assert.assertFalse(nueva_inscripcion.aprobada());
    }
}

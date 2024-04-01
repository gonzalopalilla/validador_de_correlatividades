package domain;

import org.junit.Assert;
import org.junit.Test;

public class Alumno_Test {



    @Test
    public void alumno_tiene_ADS_Discreta_aprobadas(){



        Materia discreta = new Materia(1,"Matematica Discreta",null, (Materia) null);
        Materia algoritmos = new Materia(2,"Algoritmo y Estructura de Datos",null, (Materia) null);


        Alumno pedro = new Alumno(1,"Pedro Perez",discreta,algoritmos);

        Assert.assertEquals(2,pedro.getMaterias_aprobadas().size());
        Assert.assertTrue(pedro.getMaterias_aprobadas().contains(discreta));
        Assert.assertTrue(pedro.getMaterias_aprobadas().contains(algoritmos));
    }
}

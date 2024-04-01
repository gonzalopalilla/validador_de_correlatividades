package domain;

import org.junit.Assert;
import org.junit.Test;

public class materiaTest {

    @Test
    public void dds_tiene_dos_correlativas_ads_y_discreta(){
        Materia discreta = new Materia(1,"Matematica Discreta",null, (Materia) null);
        Materia algoritmos = new Materia(2,"Algortimos y Estructura de Datos",null, (Materia) null);
        Materia dds = new Materia(3,"Disenio de Sistemas",null,algoritmos,discreta);

        Assert.assertEquals(2,dds.getCorrelativas().size());
        Assert.assertTrue(dds.getCorrelativas().contains(discreta));
        Assert.assertTrue(dds.getCorrelativas().contains(algoritmos));
    }
}

package org.mcarabajal.ejemplos.repositories;

import org.mcarabajal.ejemplos.models.Examen;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamenRepositoryOtro implements ExamenRepository{

    @Override
    public Examen guardar(Examen examen) {
        return null;
    }

    @Override
    public List<Examen> findAll() {
        try {
            TimeUnit.SECONDS.sleep(5);
            System.out.println("ExamenRepositoryOtro");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

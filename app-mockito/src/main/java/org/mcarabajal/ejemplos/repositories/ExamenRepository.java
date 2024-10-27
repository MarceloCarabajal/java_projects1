package org.mcarabajal.ejemplos.repositories;

import org.mcarabajal.ejemplos.models.Examen;

import java.util.List;
import java.util.Optional;

public interface ExamenRepository {
    Examen guardar(Examen examen);
    List<Examen> findAll();
}

package org.mcarabajal.ejemplos.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mcarabajal.ejemplos.models.Examen;
import org.mcarabajal.ejemplos.repositories.ExamenRepository;
import org.mcarabajal.ejemplos.repositories.ExamenRepositoryOtro;
import org.mcarabajal.ejemplos.repositories.PreguntaRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class ExamenServiceImplTest {

    @Mock
    ExamenRepository repository;

    @Mock
    PreguntaRepository preguntaRepository;

    @InjectMocks
    ExamenServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
//        repository = mock(ExamenRepositoryOtro.class);
//        preguntaRepository = mock(PreguntaRepository.class);
//        service = new ExamenServiceImpl(repository, preguntaRepository);
    }

    @Test
    void findExamenPorNombre() {

        when(repository.findAll()).thenReturn(Datos.EXAMENES);
        Optional<Examen> examen = service.findExamenPorNombre("Matematicas");

        assertTrue(examen.isPresent());
        assertEquals(5L, examen.orElseThrow().getId());
        assertEquals("Matematicas", examen.get().getNombre());
    }

    @Test
    void findExamenPorNombreListaVacia() {
        List<Examen> datos = Collections.emptyList();

        when(repository.findAll()).thenReturn(datos);
        Optional<Examen> examen = service.findExamenPorNombre("Matematicas");

        assertFalse(examen.isPresent());

    }


    @Test
    void testPreguntasExamen() {
        when(repository.findAll()).thenReturn(Datos.EXAMENES);
        when(preguntaRepository.findPreguntasPorExamenId(anyLong())).thenReturn(Datos.PREGUNTAS);
        Examen examen = service.findExamenPorNombreConPreguntas("Matematicas");
        assertEquals(5, examen.getPreguntas().size());
        assertTrue(examen.getPreguntas().contains("aritmetica"));
    }

    @Test
    void testPreguntasExamenVerify() {
        when(repository.findAll()).thenReturn(Datos.EXAMENES);
        when(preguntaRepository.findPreguntasPorExamenId(anyLong())).thenReturn(Datos.PREGUNTAS);
        Examen examen = service.findExamenPorNombreConPreguntas("Matematicas");
        assertEquals(5, examen.getPreguntas().size());
        assertTrue(examen.getPreguntas().contains("aritmetica"));

        verify(repository).findAll();
        verify(preguntaRepository).findPreguntasPorExamenId(anyLong());
    }

    @Test
    void testNoExisteExamenVerify() {
        // Given
        when(repository.findAll()).thenReturn(Collections.emptyList());
        when(preguntaRepository.findPreguntasPorExamenId(anyLong())).thenReturn(Datos.PREGUNTAS);

        // When
        Examen examen = service.findExamenPorNombreConPreguntas("Matematicas");

        // Then
        assertNull(examen);
        verify(repository).findAll();
        verify(preguntaRepository).findPreguntasPorExamenId(5L);
    }

    @Test
    void testGuardarExamen() {
        // Given
        Examen newExamen = Datos.EXAMEN;
        newExamen.setPreguntas(Datos.PREGUNTAS);

        when(repository.guardar(any(Examen.class))).then(new Answer<Examen>(){

            Long secuencia = 8L;

            @Override
            public Examen answer(InvocationOnMock invocationOnMock) throws Throwable {
                Examen examen = invocationOnMock.getArgument(0);
                examen.setId(secuencia++);
                return examen;
            }
        });

        // When
        Examen examen = service.guardar(newExamen);

        // Then
        assertNotNull(examen.getId());
        assertEquals(8L, examen.getId());
        assertEquals("Fisica", examen.getNombre());

        verify(repository).guardar(any(Examen.class));
        verify(preguntaRepository).guardarVarias(anyList());
    }
}
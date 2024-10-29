package org.example;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Marce Carabajal";

        String detalle = curso + " " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + " " + (numeroA + numeroB));
        System.out.println(numeroA + " " + numeroB + detalle);

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2: " + detalle2);

    }
}


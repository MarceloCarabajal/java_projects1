package org.example;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java Manejo de \"String\"";
        System.out.println(curso);

        String curso2 = new String("Programacion Java Manejo de \"String\"");

        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programacion Java Manejo de \"String\"";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);


    }
}


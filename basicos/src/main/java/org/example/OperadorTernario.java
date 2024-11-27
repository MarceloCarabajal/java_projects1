package org.example;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "es verdadero" : "no es verdadero";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double hitoria = 0.0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nota de matematicas entre 2 y 10");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese nota de ciencias entre 2 y 10");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese nota de historia entre 2 y 10");
        hitoria = scanner.nextDouble();

        promedio = (matematicas + ciencias + hitoria) / 3;

        estado = promedio > 5.49 ? "Aprobado" : "Desaprobado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);
    }
}

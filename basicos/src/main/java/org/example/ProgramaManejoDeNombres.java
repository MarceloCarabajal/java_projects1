// Se requiere desarrollar un programa que reciba los nombres de los integrantes de tu familia y formatearlos

package org.example;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        String[] nameArr = {"a", "b", "c"};
        String[] transNameArr = {"a", "b", "c"};

        Scanner scanner = new Scanner(System.in);

        // Ingreso datos
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese nombre de integrante famliar " + i + ": ");
            nameArr[i - 1] = scanner.nextLine();
        }

        // Transformo como solicita el problema
        for (int i = 0; i < 3; i++) {
            transNameArr[i] = String.valueOf(nameArr[i].toUpperCase().charAt(1) + "." + nameArr[i].substring(nameArr[i].length() - 2));
        }

        // Resultado
        System.out.println("Resultado: " + transNameArr[0] + "_" + transNameArr[1] + "_" + transNameArr[2]);

    }
}

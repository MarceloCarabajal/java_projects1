package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        //String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt();// Integer.parseInt(numeroStr);
        } catch (Exception e) {
            System.out.println("Error. Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) + "\n";

        String mensajeOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) + "\n";

        String mensajeHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) + "\n";

        int numeroHex = 0x1f4; //0x al principio para convertir a Hex
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = mensajeBinario + mensajeOctal + mensajeHex;

        System.out.println(mensaje);
    }
}

package org.example;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");

        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) + "\n";
        System.out.println("mensajeBinario = " + mensajeBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) + "\n";
        System.out.println("mensajeOctal = " + mensajeOctal);

        int numeroOctal = 0764; // 0 al principio para convertir a octal
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) + "\n";
        System.out.println("mensajeHex = " + mensajeHex);

        int numeroHex = 0x1f4; //0x al principio para convertir a Hex
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = mensajeBinario + mensajeOctal + mensajeHex;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

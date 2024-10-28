package org.example;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo = "alguna_imagen.js";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(i+1));
    }
}

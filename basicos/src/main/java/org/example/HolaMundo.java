package org.example;

public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int numero = 10;
        int numero2 = 5;
        
        boolean valor = true;
        
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = 15;

        String nombre;

        nombre = "Marcelo";
        if(numero >= 10){
            nombre = "Jose";
        }

        System.out.println("nombre = " + nombre);

        int edadPersona = 5;

    }
}
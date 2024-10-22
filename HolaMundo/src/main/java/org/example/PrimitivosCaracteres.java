package org.example;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        char simbolo = '@';
        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n'; //Se usaba tambien \r antes, para Win funcionaria normalmente, pero en otro SO, funciona distinto

        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = caracter = " + (decimal == caracter));

        System.out.println("char corresponde en byte =" + espacio + retroceso + Character.BYTES);
        System.out.println("char corresponde en \tbites = " + tabulador + Character.SIZE);
        System.out.println("character.MIN_VALUE = " + nuevaLinea + Character.MIN_VALUE);
        //Otra forma de usar caracteres especiales con System.getProperty()
        System.out.println("character.MIN_VALUE = " + System.getProperty("line.separator") + Character.MIN_VALUE);
        System.out.println("character.MAX_VALUE = " + Character.MAX_VALUE);
    }
}

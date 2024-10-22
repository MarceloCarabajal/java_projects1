package org.example;

public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98343.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "FALSE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumInt = 100;
        System.out.println("otroNumInt = " + otroNumInt);

        String otroNumStr = Integer.toString(otroNumInt);
        System.out.println("otroNumStr = " + otroNumStr);

        otroNumStr = String.valueOf(otroNumInt+10);
        System.out.println("otroNumStr = " + otroNumStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = String.valueOf(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        //Otra forma de hacerlo usando la clase String
        String otroRealStr2 = Double.toString(otroRealDouble);
        System.out.println("otroRealStr2 = " + otroRealStr2);

        int i = 22768;
        short s = (short)i; //casteo
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char)i;
        System.out.println("b = " + b);
        float f = (float)i;
        System.out.println("f = " + f);
    }
}

package org.example;

import org.w3c.dom.TypeInfo;

public class PrimitivosFloat {
    public static void main(String[] args) {
        
        float realFloat = 2.12e3f; //es equivalente a 2120f;
        float realFloat2 = 1.5e4f; //es equivalente a 15000f;
        float realFloat3 = 1.5e-10f; //es equivalente a 000000000015f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat2 = " + realFloat2);
        System.out.println("realFloat3 = " + realFloat3);
        System.out.println("float corresponde en bytes a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("maximo valor de float = " + Float.MAX_VALUE);
        System.out.println("minimo valor de float = " + Float.MIN_VALUE);
        
        double realDouble = 3.4028235E38; //En este caso no es necesario poner d o D al final
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en bytes a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("maximo valor de double = " + Double.MAX_VALUE);
        System.out.println("minimo valor de double = " + Double.MIN_VALUE);
    }
}

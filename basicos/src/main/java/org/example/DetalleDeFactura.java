package org.example;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de factura:");

        String nombreFactura = "";
        double precio1 = 0;
        double precio2 = 0;

        try {
            nombreFactura = scanner.nextLine();
            if(nombreFactura.length() <= 3) {
                System.out.println("La palabra debe ser de mas de 3 caracteres");
                main(args);
                System.exit(0);
            }
            System.out.println("Ingrese precio de producto 1:");
            precio1 = scanner.nextDouble();
            System.out.println("Ingrese precio de producto 2:");
            precio2 = scanner.nextDouble();
            
            double sumPrecios = precio1 + precio2;
            //System.out.println("sumPrecios = " + sumPrecios);

            double impuesto = 1.19;
            double impuestoDelProd = sumPrecios * 0.19;
            double total = sumPrecios * impuesto;

            String mensaje = "La factura " + nombreFactura + " tiene un total bruto de $" +
                    sumPrecios + ", con un impuesto de $" + impuestoDelProd +
                    " y el monto después de impuesto es de $" + total;

            System.out.println(mensaje);
        } catch (Exception e) {
            e.toString();
        }
    }
}

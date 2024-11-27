/*Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual
en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser
del tipo int.

Si la capacidad actual es 70 litros: imprimir Estanque lleno

Si está entre 60 y menor a 70: imprimir Estanque casi lleno

Si está entre 40 y menor a 60: imprimir Estanque  3/4

Si está entre 35 y menor a 40: imprimir Medio Estanque

Si está entre 20 y menor a 35: imprimir Suficiente

Si está entre 1 y menor a 20: imprimir Insuficiente */

package org.example;

import java.util.Scanner;

public class TareaOperadores2 {
    public static void main(String[] args) {

        double medidaEnL;

        System.out.println("Ingrese medida actual en litros: ");
        Scanner scanner = new Scanner(System.in);
        medidaEnL = scanner.nextDouble();

        if( medidaEnL == 70) {
            System.out.println("Estanque casi lleno");
        } else if ( (medidaEnL >= 60 && medidaEnL < 70) ) {
            System.out.println("Estanque casi lleno");
        } else if ( (medidaEnL >= 40 && medidaEnL < 60) ) {
            System.out.println("Estanque 3/4");
        } else if ( (medidaEnL >= 35 && medidaEnL < 40) ) {
            System.out.println("Medio tanque");
        } else if ( (medidaEnL >=20 && medidaEnL < 35) ) {
            System.out.println("Suficiente");
        } else if ( (medidaEnL >=1 && medidaEnL < 20) ) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Medida incorrecta, es entre 1 y 70");
        }

    }
}

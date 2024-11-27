package org.example;

/*El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
Podría ser utilizando operador ternario. */

import java.util.Scanner;

public class TareaOperadores {
    public static void main(String[] args) {

        int n1, n2, max;

        System.out.println("Ingrese el primer numero: ");
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        n2 = scanner.nextInt();

        max = n1 > n2 ? n1 : n2;
        System.out.println("max = " + max);

    }
}

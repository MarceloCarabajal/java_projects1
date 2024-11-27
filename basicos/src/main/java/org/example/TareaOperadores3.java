/*Obtener el nombre mas largo de tres personas, según los siguientes requerimientos

Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la
clase JOptionPane y método showInputDialog().
Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir
sólo uno de los tres, el de más caracteres en el nombre.)

Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero
accedemos al nombre de la persona.

Restricción no usar loops en el desarrollo de la tarea.

Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."*/

package org.example;

import javax.swing.*;

public class TareaOperadores3 {
    public static void main(String[] args) {

        String[] nombres = new String[3];

        for (int i = 0; i < 3; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese nombre completo (nombre + apellido):");
        }

        String[] partesNombre = nombres[0].split(" ");
        int longitudMax = partesNombre[0].length() + partesNombre[1].length();

        String personaMasLarga = partesNombre[0] + " " + partesNombre[1];

        for (int i = 0; i < 3; i++) {
            partesNombre = nombres[i].split(" ");
            int longitudActual = partesNombre[0].length() + partesNombre[1].length();

            if(longitudActual > longitudMax) {
                longitudMax = longitudActual;
                personaMasLarga = partesNombre[0] + " " + partesNombre[1];
            }
        }

        JOptionPane.showMessageDialog(null, personaMasLarga + " tiene le nombre mas largo");
    }
}

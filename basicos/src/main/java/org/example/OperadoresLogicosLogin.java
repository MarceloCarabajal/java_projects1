package org.example;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "admin";
        passwords[0] = "1234";

        usernames[1] = "marcelo";
        passwords[1] = "1234";

        usernames[2] = "pepe";
        passwords[2] = "1234";*/

        String[] usernames = {"marcelo", "admin", "pepe"};
        String[] passwords = {"12345", "1234", "123"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username:");
        String u = scanner.next();

        System.out.println("Ingrese password:");
        String p = scanner.next();

        boolean esAuth = false;

        for (int i = 0; i < usernames.length; i++) {
            esAuth = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAuth;
            /*if(usernames[i].equals(u) && passwords[i].equals(p)) {
                esAuth = true;
                break;
            }*/
        }



        String mensaje = esAuth
                ? "Bienvenido ".concat(u)
                : "Usuario o contraseña incorrecta";
        /*if(esAuth){
            System.out.println("Bienvenido ".concat(u).concat("!"));
        } else {
            System.out.println("Usuario o contraseña incorrecta");
        }*/
        System.out.println("mensaje = " + mensaje);
    }
}

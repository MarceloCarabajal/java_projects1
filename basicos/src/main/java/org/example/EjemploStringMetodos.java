package org.example;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Marcelo";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Marcelo\") = " + nombre.equals("Marcelo"));
        System.out.println("nombre.equals(\"marcelo\") = " + nombre.equals("marcelo"));
        System.out.println("nombre.equalsIgnoreCase(\"marcelo\") = " + nombre.equalsIgnoreCase("marcelo"));
        System.out.println("nombre.compareTo(\"Marcelo\") = " + nombre.compareTo("Marcelo"));
        System.out.println("nombre.compareTo(\"Mara\") = " + nombre.compareTo("Mara"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"z\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"tr\") = " + trabalenguas.endsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalenguas.endsWith("guas"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());
    }
}

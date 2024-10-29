package org.example;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 3 ms, 1000 => 10 ms, 10000 => 152 ms
            //c += a + b + "\n"; // 500 => 24 ms, 1000 => 34, 10000 => 119 ms
            sb.append(a).append(b).append("\n"); // 500 => 1 ms, 1000 => 2 ms, 10000 => 19 ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}


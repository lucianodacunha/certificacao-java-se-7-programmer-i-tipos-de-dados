package aula06;

import java.io.*;

class TrabalhandoComStringBuilderBuffer {
    public static void main(String... a){
        PrintStream t = System.out;
        StringBuffer sb1 = new StringBuffer(); // thread safe
        sb1.append("Java");
        sb1.append(" é Legal");
        t.println(sb1);

        StringBuilder sb2 = new StringBuilder(sb1);
        t.println(sb2);
        t.println("Caracteres: " + sb2.length());
        sb2.delete(8, 12);
        t.println(sb2);
        t.println("Caracteres: " + sb2.length());
        sb2.insert(8, "egal");
        t.println(sb2);
        t.println(sb2.reverse());
        t.println(sb2.substring(2, 3));

    }
}
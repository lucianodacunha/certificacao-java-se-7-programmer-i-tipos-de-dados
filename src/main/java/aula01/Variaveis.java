package aula01;

import java.io.*;

public class Variaveis {

    String lang;

    public static void main(String[] args){
        PrintStream out = System.out;

        /**
         * Declaração de variáveis.
         */
        int i;
        // System.out.println(i); // não compila
        i = 10;
        System.out.println(i);
        int x = 42; // inicialização de variável na declaração.
        int a;
        int b;

        if (true){ // compila
            a = 1;
        }

        // if (a == 1){ // não compila
        //     b = 2;
        // }

        // System.out.println(b);

        out.println("Java");
    }
}